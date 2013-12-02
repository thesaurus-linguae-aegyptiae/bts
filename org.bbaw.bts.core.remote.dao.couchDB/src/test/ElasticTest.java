package test;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import java.util.Map;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.AdminClient;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.node.Node;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHitField;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.facet.FacetBuilders;
import org.elasticsearch.search.facet.statistical.StatisticalFacetBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;

public class ElasticTest
{

	public static void main(String[] args)
	{
		Node node = nodeBuilder().node();
		Client client = node.client();

		AdminClient ac = client.admin();

		client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		ElasticTest t = new ElasticTest();
		t.initRiver(client);
		// t.initRiver(client);
		// t.getContributionsByCandName(client, "aaew_corpus_aaew_full", 0);
		t.search(client);
		// // on shutdown
		// // Configuration
		// ClientConfig clientConfig = new
		// ClientConfig.Builder("http://localhost:9200").multiThreaded(true).build();
		//
		// // Construct a new Jest client according to configuration via factory
		// JestClientFactory factory = new JestClientFactory();
		// factory.setClientConfig(clientConfig);
		// JestClient clientj = factory.getObject();
		// clientj.
		node.close();

	}

	private void search(Client client)
	{
		SearchResponse response = client.prepareSearch("aaew_corpus_aaew").setTypes("aaew_corpus_aaew")
				.setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
				.setQuery(QueryBuilders.multiMatchQuery("test5566", "_all")) // Query
				// .setFilter(FilterBuilders.rangeFilter("age").from(12).to(18))
				// // Filter
				.setFrom(0).setSize(60).setExplain(true).execute().actionGet();

		System.out.println(response);

	}

	void initRiver(Client client)
	{
		String json = "{\r\n" + "    \"type\" : \"couchdb\",\r\n" + "    \"couchdb\" : {\r\n"
				+ "        \"host\" : \"localhost\",\r\n" + "        \"port\" : 5985,\r\n"
				+ "        \"db\" : \"aaew_corpus_aaew\",\r\n" + "        \"filter\" : null\r\n"
				+ "    }, index: {\r\n" + "index: aaew_corpus_aaew\r\n" + "type: aaew_corpus_aaew\r\n"
				+ "bulk_size: 100\r\n" + "bulk_timeout: 10ms\r\n" + "}\r\n}";
		client.index(Requests.indexRequest("_river").type("aaew_corpus_aaew").id("_meta").source(json)).actionGet();
	}

	public void getContributionsByCandName(Client client, String candName, int i)
	{
		QueryBuilder matchQuery = QueryBuilders.matchQuery("candNm", candName);
		FilterBuilder contribRangeFilter = FilterBuilders.rangeFilter("contbReceiptAmt").gte(i);
		StatisticalFacetBuilder facet = FacetBuilders.statisticalFacet("stat1").field("contbReceiptAmt");
		SearchRequestBuilder request = client.prepareSearch("contributions")
				.addSort(SortBuilders.fieldSort("contbReceiptAmt").order(SortOrder.DESC))
				.setSearchType(SearchType.QUERY_THEN_FETCH).setQuery(matchQuery).setFilter(contribRangeFilter)
				.addFacet(facet).setFrom(0).setSize(100)
				.addFields("contbrNm", "candNm", "contbrEmployer", "contbReceiptAmt");
		System.out.println("SEARCH QUERY: " + request.toString());

		SearchResponse response = request.execute().actionGet();
		SearchHits searchHits = response.getHits();
		SearchHit[] hits = searchHits.getHits();
		for (SearchHit hit : hits)
		{
			Map<String, SearchHitField> fields = hit.getFields();
			System.out.println(hit.getId() + ", contbrEmployer=" + fields.get("contbrEmployer").getValue().toString());
		}
	}

}
