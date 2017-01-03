package bts.transform.ui.chars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileEntityReplacer {

	public static void main(String... aArgs) throws IOException {
		FileEntityReplacer text = new FileEntityReplacer();

//		// treat as a small file
//		List<String> lines = text.readSmallTextFile(FILE_NAME);
//		log(lines);
//		lines.add("This is a line added in code.");
//		text.writeSmallTextFile(lines, FILE_NAME);

		// treat as a large file - use some buffering
//		text.readLargerTextFile(FILE_NAME);
//		List<String> lines = Arrays.asList("Down to the Waterline", "Water of Love");
//		text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);
		
		text.readLargerTextFileAlternate(FILE_NAME, OUTPUT_FILE_NAME, null);
		System.out.println("finished");
	}

	
	//"D:\\AAEW\\transform\\corpus\\tla_digital_heka_juli_2014.corpusdtdneu";
	//tla_bbaw_juli_2014.corpusdtdneu
	final static String FILE_NAME = "D:\\AAEW\\transform4\\data\\wlist\\demotbwl_2015.xml";//corpus\\tla_demotisch_juli_2014.corpusdtdneu"; 
			//corpus\\tla_saw_juli_2014.corpusdtdneu"; 
	//"D:\\AAEW\\transform\\corpus\\tla_tb_juli_2014.corpusdtdneu"; 
	//authors\\authors_2_replaced2.btsaux";//
	final static String OUTPUT_FILE_NAME = "D:\\AAEW\\transform4\\data\\wlist\\demotbwl_2015.btsaux"; //"D:\\AAEW\\transform\\authors\\authors_2_replaced3.btsaux";
	final static Charset ENCODING = StandardCharsets.UTF_8;

	// For smaller files

	/**
	 * Note: the javadoc of Files.readAllLines says it's intended for small
	 * files. But its implementation uses buffering, so it's likely good even
	 * for fairly large files.
	 */
	List<String> readSmallTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		return Files.readAllLines(path, ENCODING);
	}

	void writeSmallTextFile(List<String> aLines, String aFileName)
			throws IOException {
		Path path = Paths.get(aFileName);
		Files.write(path, aLines, ENCODING);
	}

	// For larger files

	void readLargerTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		try (Scanner scanner = new Scanner(path, ENCODING.name())) {
			while (scanner.hasNextLine()) {
				// process each line in some way
//				log(scanner.nextLine());
			}
		}
	}

	void readLargerTextFileAlternate(String inputFileName, String outputFilename, String prefix) throws IOException {
		Path inpath = Paths.get(inputFileName);
		Path outpath = Paths.get(outputFilename);
		BufferedWriter writer = Files.newBufferedWriter(outpath, ENCODING);
		BufferedReader reader = Files.newBufferedReader(inpath, ENCODING);
		String line = null;
		try {
			if (prefix != null)
			{
				writer.write(prefix);
				writer.newLine();
			}
			boolean intro = true;

			while ((line = reader.readLine()) != null) {
				// process each line in some way
				if (prefix != null && intro)
				{
					
					if (!(line.startsWith("<!") || line.startsWith("<?")))
					{
						intro = false;
						line = CharsService.replaceEntities(line, false);
						writer.write(line);
						writer.newLine();
					}
				}
				else
				{
					line = CharsService.replaceEntities(line, false);
					try {
						writer.write(line);
					} catch (Exception e) {
						System.out.println("line " +line);
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					writer.newLine();
				}
//			log(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(line);
			e.printStackTrace();
		}
		writer.flush();
		writer.close();
		
	}

	void writeLargerTextFile(String aFileName, List<String> aLines)
			throws IOException {
		Path path = Paths.get(aFileName);
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {
			for (String line : aLines) {
				writer.write(line);
				writer.newLine();
			}
			writer.flush();
			writer.close();
		}
	}

	private static void log(Object aMsg) {
		System.out.println(String.valueOf(aMsg));
	}

}
