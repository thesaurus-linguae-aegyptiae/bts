package org.bbaw.bts.db.couchdb.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.services.log.Logger;
import org.elasticsearch.action.bulk.BulkProcessor;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.lightcouch.ChangesResult;
import org.lightcouch.ChangesResult.Row;
import org.lightcouch.CouchDbClient;

public class CouchDBIndexHelper {

	private CouchDBIndexHelper(){}
	
	public static int fetchAndIndexChangesSeq(String collection, BulkProcessor bulkProcessor, Client esClient, CouchDbClient dbClient, int seq, IProgressMonitor monitor, Logger logger)
	{
		List<String> lines = fetchLine(collection, dbClient, seq);
		Object returnSeq = processLines(lines, collection, bulkProcessor, monitor, logger);
		if (returnSeq instanceof String)
		{
			seq = new Integer(((String) returnSeq)).intValue();
		}
		return seq;
	}
	

	

	private static List<String> fetchLine(String collection, CouchDbClient dbClient,
			int seq) {
		ChangesResult cr = dbClient.changes().includeDocs(true).since(new Integer(seq).toString()).getChanges();
		List<Row> rows = cr.getResults();
		List<String> lines = new Vector<String>(rows.size());

		for (Row row : rows)
		{
			lines.add(row.getDoc().toString());
		}
		// TODO Auto-generated method stub
		return lines;
	}
	private static Object processLines(List<String> lines, String indexName,
			BulkProcessor bulkProcessor, IProgressMonitor monitor, Logger logger) {
		for (String line : lines)
		{
			processLine(line, indexName, bulkProcessor, monitor, logger);
		}
		return null;
	}
	private static Object processLine(String s, String indexName, BulkProcessor bulkProcessor, IProgressMonitor monitor, Logger logger) {
        Map<String, Object> ctx;
        try {
            ctx = XContentFactory.xContent(XContentType.JSON).createParser(s).mapAndClose();
        } catch (IOException e) {
            logger.warn("failed to parse {}", e, s);
            return null;
        }
        if (ctx.containsKey("error")) {
            logger.warn("received error {}", s);
            return null;
        }
        Object seq = ctx.get("seq");
        Object oId = ctx.get("id");
        if (oId == null) {
            return null;
        }

        String id = oId.toString();


        // Ignore design documents
        if (id.startsWith("_design/")) {
            if (logger.isTraceEnabled()) {
                logger.trace("ignoring design document {}", id);
            }
            return seq;
        }

//        if (script != null) {
//            script.setNextVar("ctx", ctx);
//            try {
//                script.run();
//                // we need to unwrap the ctx...
//                ctx = (Map<String, Object>) script.unwrap(ctx);
//            } catch (Exception e) {
//                logger.warn("failed to script process {}, ignoring", e, ctx);
//                return seq;
//            }
//        }

        if (ctx.containsKey("ignore") && ctx.get("ignore").equals(Boolean.TRUE)) {
            // ignore dock
        } else if (ctx.containsKey("deleted") && ctx.get("deleted").equals(Boolean.TRUE)) {
            String index = extractIndex(ctx, indexName);
            String type = extractType(ctx, indexName);
            if (logger.isTraceEnabled()) {
                logger.trace("processing [delete]: " + index +"/"+ type +"/"+ id);
            }
            if (monitor != null && monitor.isCanceled()) {
                logger.warn("river was closing while trying to delete document " + index +"/"+ type +"/"+ id +". Operation skipped.");
                return null;
            }
            bulkProcessor.add(new DeleteRequest(index, type, id).routing(extractRouting(ctx)).parent(extractParent(ctx)));
        } else if (ctx.containsKey("doc")) {
            String index = extractIndex(ctx, indexName);
            String type = extractType(ctx, indexName);
            Map<String, Object> doc = (Map<String, Object>) ctx.get("doc");

//            // Remove _attachment from doc if needed
//            if (couchIgnoreAttachments) {
//                // no need to log that we removed it, the doc indexed will be shown without it
//                doc.remove("_attachments");
//            } else {
//                // TODO by now, couchDB river does not really store attachments but only attachments meta infomration
//                // So we perhaps need to fully support attachments
//            }

            if (logger.isTraceEnabled()) {
                logger.trace("processing [index ]: " + index +"/"+ type +"/"+ id +", source "+ doc);
            }
            if (monitor != null && monitor.isCanceled()) {
                logger.warn("river was closing while trying to index document [{}/{}/{}]. Operation skipped." + index +"/"+ type +"/"+ id);
                return null;
            }
            bulkProcessor.add(new IndexRequest(index, type, id).source(doc).routing(extractRouting(ctx)).parent(extractParent(ctx)));
        } else {
            logger.warn("ignoring unknown change {}", s);
        }
        return seq;
    }
	
	private static String extractParent(Map<String, Object> ctx) {
        return (String) ctx.get("_parent");
    }

    private static String extractRouting(Map<String, Object> ctx) {
        return (String) ctx.get("_routing");
    }

    private static String extractType(Map<String, Object> ctx, String typeName) {
        String type = (String) ctx.get("_type");
        if (type == null) {
            type = typeName;
        }
        return type;
    }

    private static String extractIndex(Map<String, Object> ctx, String indexName) {
        String index = (String) ctx.get("_index");
        if (index == null) {
            index = indexName;
        }
        return index;
    }

	public static void indexDoc(String collection, BulkProcessor bulkProcessor,
			Client esClient, String doc, IProgressMonitor monitor, Logger logger) {
		processDocLine(doc, collection, esClient, bulkProcessor, monitor, logger);
		
	}

	private static void processDocLine(String docString, String indexName,
			Client esClient, BulkProcessor bulkProcessor, IProgressMonitor monitor, Logger logger) {
		Map<String, Object> doc;
        try {
            doc = XContentFactory.xContent(XContentType.JSON).createParser(docString).mapAndClose();
        } catch (IOException e) {
            logger.warn("failed to parse {}", e, docString);
            return;
        }
        if (doc.containsKey("error")) {
            logger.warn("received error {}", docString);
            return;
        }
	        Object oId = doc.get("_id");
	        if (oId == null) {
	            return;
	        }

	        String id = oId.toString();
	        IndexResponse response = esClient.prepareIndex(indexName, indexName, id)
	                .setSource(docString)
	                .execute()
	                .actionGet();
	            if (monitor != null)
	            {
	            	monitor.worked(1);
	            	if (monitor.isCanceled()) return;
	            }
	        return;
	    }
}
