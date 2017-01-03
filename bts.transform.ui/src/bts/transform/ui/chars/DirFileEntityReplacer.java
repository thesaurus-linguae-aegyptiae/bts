package bts.transform.ui.chars;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class DirFileEntityReplacer {
	private static final String DIR = "D:/AAEW/transform5/corpus";

	public static void main(String... aArgs) throws IOException {
		

//		// treat as a small file
//		List<String> lines = text.readSmallTextFile(FILE_NAME);
//		log(lines);
//		lines.add("This is a line added in code.");
//		text.writeSmallTextFile(lines, FILE_NAME);

		// treat as a large file - use some buffering
//		text.readLargerTextFile(FILE_NAME);
//		List<String> lines = Arrays.asList("Down to the Waterline", "Water of Love");
//		text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);
		replaceDir(DIR);
		System.out.println("finished");
	}

	private static void replaceDir(String dir2) {
		File dir = new File(dir2);
		FileEntityReplacer text = new FileEntityReplacer();

		FilenameFilter ff = new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String name) {
				return (name.endsWith(".xml"));
			}
		};
		if (dir.isDirectory())
		{
			String filePrefix = loadFilePrefix();
			for (String fname : dir.list(ff))
			{
				String newName = dir2 + "/" + fname.replace(".xml", ".corpusdtdneu");
				System.out.println("name " + dir2 + "/" +fname + " new " + newName);
				try {
					
					text.readLargerTextFileAlternate(dir2 + "/" +fname, newName, filePrefix);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
		

		
	}

	private static String loadFilePrefix() {
		String prefix = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<!-- copyright:\r\n" + 
				"Altaegyptisches Woerterbuch,\r\n" + 
				"Berlin-Brandenburgische Akademie der Wissenschaften\r\n" + 
				"(C) 2001\r\n" + 
				"-->\r\n" + 
				"\r\n" + 
				"<!-- Version:\r\n" + 
				"0.0 - 2001.07.12\r\n" + 
				"-->\r\n" + 
				"\r\n" + 
				"<!-- BTS Zeichensatz - BTS-Entities -->\r\n" + 
				"<!DOCTYPE EgyTxtCorpus [\r\n" + 
				"  <!ENTITY  aleph \"&#128;\">\r\n" + 
				"  <!ENTITY  AlephU \"&#129;\">\r\n" + 
				"  <!ENTITY  spiLen \"&#130;\">\r\n" + 
				"  <!ENTITY  SpiLenU \"&#131;\">\r\n" + 
				"  <!ENTITY  ajin \"&#132;\">\r\n" + 
				"  <!ENTITY  AjinU \"&#133;\">\r\n" + 
				"  <!ENTITY  hDot  \"&#134;\">\r\n" + 
				"  <!ENTITY  HDotU  \"&#135;\">\r\n" + 
				"  <!ENTITY  hArc  \"&#136;\">\r\n" + 
				"  <!ENTITY  HArcU  \"&#137;\">\r\n" + 
				"  <!ENTITY  hUs  \"&#138;\">\r\n" + 
				"  <!ENTITY  HUsU  \"&#139;\">\r\n" + 
				"  <!ENTITY  schin  \"&#140;\">\r\n" + 
				"  <!ENTITY  SchinU  \"&#141;\">\r\n" + 
				"  <!ENTITY  tUs  \"&#142;\">\r\n" + 
				"  <!ENTITY  TUsU  \"&#143;\">\r\n" + 
				"  <!ENTITY  dUs  \"&#144;\">\r\n" + 
				"  <!ENTITY  DUsU  \"&#145;\">\r\n" + 
				"  <!ENTITY  iSpirit  \"&#146;\">\r\n" + 
				"  <!ENTITY  ISpiritU  \"&#147;\">\r\n" + 
				"  <!ENTITY  hDem  \"&#148;\">\r\n" + 
				"  <!ENTITY  HDemU  \"&#149;\">\r\n" + 
				"  <!ENTITY  tDem  \"&#150;\">\r\n" + 
				"  <!ENTITY  TDemU  \"&#151;\">\r\n" + 
				"  <!ENTITY  eDem  \"&#152;\">\r\n" + 
				"  <!ENTITY  EDemU  \"&#153;\">\r\n" + 
				"  <!ENTITY  iTrema  \"&#154;\">\r\n" + 
				"  <!ENTITY  ITremaU  \"&#155;\">\r\n" + 
				"  <!ENTITY  plChr  \"&#156;\">\r\n" + 
				"  <!ENTITY  duChr  \"&#157;\">\r\n" + 
				"  <!ENTITY  sicChr  \"&#158;\">\r\n" + 
				"  <!ENTITY  iArc  \"&#178;\">\r\n" + 
				"  <!ENTITY  IArcU  \"&#179;\">\r\n" + 
				"  <!ENTITY  trplColon  \"&#181;\">\r\n" + 
				"  <!ENTITY  uArc  \"&#195;\">\r\n" + 
				"  <!ENTITY  dblLt  \"&#197;\">\r\n" + 
				"  <!ENTITY  dblGt  \"&#198;\">\r\n" + 
				"  <!ENTITY  dblBraceOn  \"&#203;\">\r\n" + 
				"  <!ENTITY  dblBraceOff  \"&#207;\">\r\n" + 
				"  <!ENTITY  dblBrackOn  \"&#208;\">\r\n" + 
				"  <!ENTITY  dblBrackOff  \"&#209;\">\r\n" + 
				"  <!ENTITY  dblSqOn  \"&#215;\">\r\n" + 
				"  <!ENTITY  dblSqOff  \"&#216;\">\r\n" + 
				"  <!ENTITY  halfSqOn  \"&#213;\">\r\n" + 
				"  <!ENTITY  halfSqOff  \"&#222;\">\r\n" + 
				"  <!ENTITY  trplEqu  \"&#227;\">\r\n" + 
				"  <!ENTITY  cartOn  \"&#229;\">\r\n" + 
				"  <!ENTITY  cartOff  \"&#230;\">\r\n" + 
				"  <!ENTITY  UArcU  \"&#235;\">\r\n" + 
				"  <!ENTITY  verse  \"&#176;\">\r\n" + 
				"  <!ENTITY  versePoint  \"&#240;\">\r\n" + 
				"  <!ENTITY  delVP  \"&#123;&#241;&#125;\">\r\n" + 
				"  <!ENTITY  zeroChr  \"&#245;\">\r\n" + 
				"  <!ENTITY  serechOn  \"&#247;\">\r\n" + 
				"  <!ENTITY  serechOff  \"&#248;\">\r\n" + 
				"  <!ENTITY  ovalOn  \"&#254;\">\r\n" + 
				"  <!ENTITY  ovalOff  \"&#255;\">\r\n" + 
				"\r\n" + 
				"<!-- ANSI 160-255 = UNICODE, HTML-entities -->\r\n" + 
				"\r\n" + 
				"  <!ENTITY  nbsp  \"&#160;\">\r\n" + 
				"  <!ENTITY  iexcl  \"&#161;\"> \r\n" + 
				"  <!ENTITY  cent  \"&#162;\">\r\n" + 
				"  <!ENTITY  pound  \"&#163;\">\r\n" + 
				"  <!ENTITY  curren  \"&#164;\">\r\n" + 
				"  <!ENTITY  yen  \"&#165;\">\r\n" + 
				"  <!ENTITY  brvbar  \"&#166;\"> \r\n" + 
				"  <!ENTITY  sect  \"&#167;\"> \r\n" + 
				"  <!ENTITY  uml  \"&#168;\">\r\n" + 
				"  <!ENTITY  copy  \"&#169;\">\r\n" + 
				"  <!ENTITY  ordf  \"&#170;\">\r\n" + 
				"  <!ENTITY  laquo  \"&#171;\"> \r\n" + 
				"  <!ENTITY  not  \"&#172;\">\r\n" + 
				"  <!ENTITY  shy  \"&#173;\">\r\n" + 
				"  <!ENTITY  reg  \"&#174;\">\r\n" + 
				"  <!ENTITY  macr  \"&#175;\">\r\n" + 
				"  <!ENTITY  deg  \"&#176;\">\r\n" + 
				"  <!ENTITY  plusmn  \"&#177;\">\r\n" + 
				"  <!ENTITY  sup2  \"&#178;\">\r\n" + 
				"  <!ENTITY  sup3  \"&#179;\">\r\n" + 
				"  <!ENTITY  acute  \"&#180;\"> \r\n" + 
				"  <!ENTITY  micro  \"&#181;\"> \r\n" + 
				"  <!ENTITY  para  \"&#182;\">\r\n" + 
				"  <!ENTITY  middot  \"&#183;\">\r\n" + 
				"  <!ENTITY  cedil  \"&#184;\">\r\n" + 
				"  <!ENTITY  sup1  \"&#185;\">\r\n" + 
				"  <!ENTITY  ordm  \"&#186;\">\r\n" + 
				"  <!ENTITY  raquo  \"&#187;\">\r\n" + 
				"  <!ENTITY  frac14  \"&#188;\">\r\n" + 
				"  <!ENTITY  frac12  \"&#189;\">\r\n" + 
				"  <!ENTITY  frac34  \"&#190;\">\r\n" + 
				"  <!ENTITY  iquest  \"&#191;\"> \r\n" + 
				"  <!ENTITY  Agrave  \"&#192;\">\r\n" + 
				"  <!ENTITY  Aacute  \"&#193;\">\r\n" + 
				"  <!ENTITY  Acirc  \"&#194;\">\r\n" + 
				"  <!ENTITY  Atilde  \"&#195;\">\r\n" + 
				"  <!ENTITY  Auml  \"&#196;\">\r\n" + 
				"  <!ENTITY  Aring  \"&#197;\">\r\n" + 
				"  <!ENTITY  AElig  \"&#198;\">\r\n" + 
				"  <!ENTITY  Ccedil  \"&#199;\">\r\n" + 
				"  <!ENTITY  Egrave  \"&#200;\">\r\n" + 
				"  <!ENTITY  Eacute  \"&#201;\"> \r\n" + 
				"  <!ENTITY  Ecirc  \"&#202;\">\r\n" + 
				"  <!ENTITY  Euml  \"&#203;\">\r\n" + 
				"  <!ENTITY  Igrave  \"&#204;\">\r\n" + 
				"  <!ENTITY  Iacute  \"&#205;\">\r\n" + 
				"  <!ENTITY  Icirc  \"&#206;\">\r\n" + 
				"  <!ENTITY  Iuml  \"&#207;\">\r\n" + 
				"  <!ENTITY  ETH  \"&#208;\">\r\n" + 
				"  <!ENTITY  Ntilde  \"&#209;\">\r\n" + 
				"  <!ENTITY  Ograve  \"&#210;\">\r\n" + 
				"  <!ENTITY  Oacute  \"&#211;\"> \r\n" + 
				"  <!ENTITY  Ocirc  \"&#212;\">\r\n" + 
				"  <!ENTITY  Otilde  \"&#213;\">\r\n" + 
				"  <!ENTITY  Ouml  \"&#214;\">\r\n" + 
				"  <!ENTITY  times  \"&#215;\">\r\n" + 
				"  <!ENTITY  Oslash  \"&#216;\">\r\n" + 
				"  <!ENTITY  Ugrave  \"&#217;\">\r\n" + 
				"  <!ENTITY  Uacute  \"&#218;\">\r\n" + 
				"  <!ENTITY  Ucirc  \"&#219;\">\r\n" + 
				"  <!ENTITY  Uuml  \"&#220;\">\r\n" + 
				"  <!ENTITY  Yacute  \"&#221;\"> \r\n" + 
				"  <!ENTITY  THORN  \"&#222;\">\r\n" + 
				"  <!ENTITY  szlig  \"&#223;\">\r\n" + 
				"  <!ENTITY  agrave  \"&#224;\">\r\n" + 
				"  <!ENTITY  aacute  \"&#225;\">\r\n" + 
				"  <!ENTITY  acirc  \"&#226;\">\r\n" + 
				"  <!ENTITY  atilde  \"&#227;\">\r\n" + 
				"  <!ENTITY  auml  \"&#228;\">\r\n" + 
				"  <!ENTITY  aring  \"&#229;\">\r\n" + 
				"  <!ENTITY  aelig  \"&#230;\">\r\n" + 
				"  <!ENTITY  ccedil  \"&#231;\"> \r\n" + 
				"  <!ENTITY  egrave  \"&#232;\"> \r\n" + 
				"  <!ENTITY  eacute  \"&#233;\">\r\n" + 
				"  <!ENTITY  ecirc  \"&#234;\">\r\n" + 
				"  <!ENTITY  euml  \"&#235;\">\r\n" + 
				"  <!ENTITY  igrave  \"&#236;\">\r\n" + 
				"  <!ENTITY  iacute  \"&#237;\">\r\n" + 
				"  <!ENTITY  icirc  \"&#238;\">\r\n" + 
				"  <!ENTITY  iuml  \"&#239;\">\r\n" + 
				"  <!ENTITY  eth  \"&#240;\">\r\n" + 
				"  <!ENTITY  ntilde  \"&#241;\">\r\n" + 
				"  <!ENTITY  ograve  \"&#242;\"> \r\n" + 
				"  <!ENTITY  oacute  \"&#243;\">\r\n" + 
				"  <!ENTITY  ocirc  \"&#244;\">\r\n" + 
				"  <!ENTITY  otilde  \"&#245;\">\r\n" + 
				"  <!ENTITY  ouml  \"&#246;\">\r\n" + 
				"  <!ENTITY  divide  \"&#247;\">\r\n" + 
				"  <!ENTITY  oslash  \"&#248;\">\r\n" + 
				"  <!ENTITY  ugrave  \"&#249;\">\r\n" + 
				"  <!ENTITY  uacute  \"&#250;\">\r\n" + 
				"  <!ENTITY  ucirc  \"&#251;\">\r\n" + 
				"  <!ENTITY  uuml  \"&#252;\">\r\n" + 
				"  <!ENTITY  yacute  \"&#253;\">\r\n" + 
				"  <!ENTITY  thorn  \"&#254;\">\r\n" + 
				"  <!ENTITY  yuml  \"&#255;\">\r\n" + 
				"\r\n" + 
				"<!-- UNICODE Latin extended-A HTML entities -->\r\n" + 
				"\r\n" + 
				"  <!ENTITY  OElig  \"&#338;\">\r\n" + 
				"  <!ENTITY  oelig  \"&#339;\">\r\n" + 
				"  <!ENTITY  Scaron  \"&#352;\">\r\n" + 
				"  <!ENTITY  scaron  \"&#353;\">\r\n" + 
				"  <!ENTITY  Yuml  \"&#376;\">\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!-- Ende der Character-Entity-Deklarationen -->\r\n" + 
				"\r\n" + 
				"<!-- Das Span-Element zum Umschalten zwischen Transkription und Normalschrift -->\r\n" + 
				"\r\n" + 
				"  <!ELEMENT Span (#PCDATA | Span)*>\r\n" + 
				"  <!ATTLIST Span chrset (egy | lat) #REQUIRED>\r\n" + 
				"\r\n" + 
				"<!-- ============================================================================= -->\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgyTxtCorpus (TCHeader, (PicturesTable | TCCaption | TCGroup | TCArrangement | TCObject |\r\n" + 
				"TCObjPart | TCScene | TCText | EgyTxt)*)>\r\n" + 
				"<!ATTLIST EgyTxtCorpus DTDVersion CDATA #REQUIRED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCHeader (Date?, Author?, Project?, Title?, Comment?)>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!ELEMENT PicturesTable (Picture)*>\r\n" + 
				"\r\n" + 
				"<!ELEMENT Picture (FileName?, FilePath?, Name?, Author?, Bibliography?)>\r\n" + 
				"<!ATTLIST Picture Key CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture Width CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture Height CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture Dpi CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture PictType CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture Scale CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST Picture Authorization CDATA #REQUIRED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT FileName (#PCDATA)>\r\n" + 
				"<!ELEMENT FilePath (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!-- Globale Elemente -->\r\n" + 
				"<!-- das sind wiederkehrende Strukturen und im wesentlichen einfach Datenwerte,\r\n" + 
				"die durch die Elementbezeichnungen semantisch klassifiziert werden.\r\n" + 
				"-->\r\n" + 
				"\r\n" + 
				"<!ELEMENT Name (#PCDATA)>\r\n" + 
				"<!ELEMENT Translation (#PCDATA)>\r\n" + 
				"<!ELEMENT Translat (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT Value (#PCDATA)>\r\n" + 
				"<!ELEMENT Graphics (#PCDATA)>\r\n" + 
				"<!ELEMENT Comment (#PCDATA)>\r\n" + 
				"<!ELEMENT Code (#PCDATA)>\r\n" + 
				"<!ELEMENT Term (#PCDATA)>\r\n" + 
				"<!ELEMENT Date (#PCDATA | DateThs|Code|Comment)* >\r\n" + 
				"<!-- originale definition\r\n" + 
				"<!ELEMENT Date (#PCDATA | (DateThs?,Code?,Comment?) >\r\n" + 
				" -->\r\n" + 
				"<!ELEMENT Author (#PCDATA)>\r\n" + 
				"<!ELEMENT Project (#PCDATA)>\r\n" + 
				"<!ELEMENT Title (#PCDATA)>\r\n" + 
				"<!ELEMENT BtsCodes (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT ThsEntry (Term,Hierarchy,Comment?)>\r\n" + 
				"<!ATTLIST ThsEntry Type ( BTS ) #REQUIRED>\r\n" + 
				"<!ATTLIST ThsEntry Category ( Provenance| Date | ObjectType | Depiction | Script |\r\n" + 
				"Language | TextType | Museum ) #IMPLIED>\r\n" + 
				"<!ATTLIST ThsEntry Key CDATA #REQUIRED>\r\n" + 
				"<!ELEMENT Hierarchy (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT DateThs (Term?,LowerTerm?,UpperTerm?)>\r\n" + 
				"<!ATTLIST DateThs type ( BTS ) #REQUIRED>\r\n" + 
				"<!ATTLIST DateThs YearFrom CDATA #REQUIRED>\r\n" + 
				"<!ATTLIST DateThs YearTo CDATA #REQUIRED>\r\n" + 
				"<!ELEMENT LowerTerm (#PCDATA)>\r\n" + 
				"<!ELEMENT UpperTerm (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!-- Elemente der ObjTxt Baumhierarchie -->\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCCaption (TCPassport? , TCPicture*, TCNotebook*, (TCCaption | TCGroup | TCArrangement | TCObject|TCObjPart |TCText)*)>\r\n" + 
				"<!ATTLIST TCCaption TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCCaption SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCCaption Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCGroup (TCPassport? , TCPicture*,PictLink*, TCNotebook*, (TCCaption|TCGroup | TCArrangement | TCObject)*)>\r\n" + 
				"<!ATTLIST TCGroup TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCGroup SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCGroup Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCArrangement (TCPassport? , TCPicture*, TCNotebook*, (TCArrangement | TCObject)*)>\r\n" + 
				"<!ATTLIST TCArrangement TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCArrangement SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCArrangement Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCObject (TCPassport? , TCPicture*, PictLink*,TCNotebook*, (TCCaption|TCObject | TCObjPart | TCScene | TCSuperText | TCText)*)>\r\n" + 
				"<!ATTLIST TCObject TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCObject SortKey CDATA \"0\" >\r\n" + 
				"<!-- stabile ID -->\r\n" + 
				"<!ATTLIST TCObject ObjectID NMTOKEN #IMPLIED >\r\n" + 
				"<!-- GIS -->\r\n" + 
				"<!ATTLIST TCObject GIS CDATA #IMPLIED >\r\n" + 
				"<!-- Stand der Bearbeitung -->\r\n" + 
				"<!ATTLIST TCObject Bearbeitungsstand NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST TCObject Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCObjPart (TCPassport? , TCPicture*, PictLink*,TCNotebook*, (TCCaption|TCObject | TCObjPart | TCScene | TCSuperText | TCText)*)>\r\n" + 
				"<!ATTLIST TCObjPart TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCObjPart SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCObjPart Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCScene (TCPassport? , TCPicture*,  TCNotebook*, (TCCaption|TCScene | TCSuperText | TCText)*)>\r\n" + 
				"<!ATTLIST TCScene TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCScene SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCScene Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCSuperText (TCPassport? , TCPicture*, TCNotebook*, TCText*)>\r\n" + 
				"<!ATTLIST TCSuperText TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCSuperText SortKey CDATA \"0\" >\r\n" + 
				"<!ATTLIST TCSuperText Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCText (TCPassport? , TCPicture*,PictLink*, TCNotebook*, EgyTxt?)>\r\n" + 
				"<!ATTLIST TCText TCName CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST TCText SortKey CDATA \"0\" >\r\n" + 
				"<!-- stabile ID -->\r\n" + 
				"<!ATTLIST TCText TextID NMTOKEN #IMPLIED >\r\n" + 
				"<!-- Stand der Bearbeitung -->\r\n" + 
				"<!ATTLIST TCText Bearbeitungsstand NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST TCText Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!-- Passportdaten -->\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCPassport (Definition?,Protocol?,Bibliography?,Provenance?,\r\n" + 
				"Date?,ObjectType?,Depiction?,Script?,Language?,LangComment?,Work?,\r\n" + 
				"TextType?,LineCount?,Codes?,WbFolder?,WbSlips?,Code1?,Code2?,BtsCodes?,Comment?,Notes?,FullName?,NameSort?,\r\n" + 
				"TCLocation*)>\r\n" + 
				"<!ELEMENT Definition (#PCDATA)>\r\n" + 
				"<!ELEMENT Protocol (#PCDATA)>\r\n" + 
				"<!ELEMENT Bibliography (#PCDATA)>\r\n" + 
				"<!ELEMENT Provenance (PassportDataItem)>\r\n" + 
				"<!ELEMENT ObjectType (PassportDataItem)>\r\n" + 
				"<!ELEMENT Depiction (PassportDataItem)>\r\n" + 
				"<!ELEMENT Script (PassportDataItem)>\r\n" + 
				"<!ELEMENT Language (PassportDataItem)>\r\n" + 
				"<!ELEMENT LangComment (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TextType (PassportDataItem)>\r\n" + 
				"<!ELEMENT LineCount (#PCDATA | Value | Comment)*>\r\n" + 
				"<!ELEMENT WbFolder (#PCDATA)>\r\n" + 
				"<!ELEMENT WbSlips (#PCDATA)>\r\n" + 
				"<!ELEMENT Code1 (#PCDATA)>\r\n" + 
				"<!ELEMENT Code2 (#PCDATA)>\r\n" + 
				"<!ELEMENT Form (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT Work (Name, Comment)>\r\n" + 
				"<!ATTLIST Work Thesaurus CDATA #IMPLIED >\r\n" + 
				"<!ATTLIST Work VersionCode CDATA #IMPLIED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT Codes (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT Notes (#PCDATA)>\r\n" + 
				"<!ELEMENT FullName (#PCDATA)>\r\n" + 
				"<!ELEMENT NameSort (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!-- die Informationskategorien der Passportdaten sind in PassportDataItem-\r\n" + 
				"Elementen enthalten; diese werden in uebergeordnete Elemente eingeschachtelt,\r\n" + 
				"um Anzahl und Reihenfolge durch die DTD kontrollieren zu koennen; die\r\n" + 
				"Information des Wrapper-Elements und des Attributs Category sind redundant.\r\n" + 
				"-->\r\n" + 
				"\r\n" + 
				"<!ELEMENT PassportDataItem (ThsEntry?,Code?,Comment?)>\r\n" + 
				"<!ATTLIST PassportDataItem Category ( Provenance | Date | ObjectType | Depiction\r\n" + 
				"| Script | Language | TextType ) #REQUIRED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCLocation (ThsEntry,MuseumNumber?,Comment?)>\r\n" + 
				"<!ELEMENT MuseumNumber (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCNotebook (#PCDATA)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT TCPicture (#PCDATA)>\r\n" + 
				"<!-- Art der Abbildung -->\r\n" + 
				"<!ATTLIST TCPicture PictureType CDATA #REQUIRED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT PictLink (Name, Comment)>\r\n" + 
				"<!ATTLIST PictLink Key CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST PictLink Left CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST PictLink Right CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST PictLink Top CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST PictLink Bottom CDATA #REQUIRED >\r\n" + 
				"\r\n" + 
				"<!-- Elemente der Textabschrift -->\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgyTxt (Name, BtsCodes?, Comment?, (EgySubTxt | EgySent | EgyTB1 |\r\n" + 
				"EgySzenario | Glosse |\r\n" + 
				"EgyTB3Start | EgyTB3End)*)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgySubTxt (Name, BtsCodes?, Comment?, (EgySubTxt | EgySent | EgyTB1 |\r\n" + 
				"EgySzenario | Glosse |\r\n" + 
				"EgyTB3Start | EgyTB3End)*)>\r\n" + 
				"<!ATTLIST EgySubTxt SortKey CDATA #IMPLIED >"+
				"\r\n" + 
				"<!ELEMENT EgySzenario (EgySent*)>\r\n" + 
				"<!ATTLIST EgySzenario InterneNummer CDATA #IMPLIED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT Glosse ((EgySent | EgyTB1 | EgyTB3Start |\r\n" + 
				"EgyTB3End | EgyWord | LineCount | Note | FormattingElement |\r\n" + 
				"LanguagePassage | BausteinPassage | LeipzigPassage | GlossePassage |\r\n" + 
				"Punctuation | EgyPunctuation)*)>\r\n" + 
				"<!ATTLIST Glosse PassageID CDATA #IMPLIED >\r\n" + 
				"\r\n" + 
				"<!-- alle SubSent-Elemente werden in Sent Type=\"NS\" konvertiert;\r\n" + 
				"SubSent ist deprecated -->\r\n" + 
				"<!ELEMENT EgySent (Value?, Translat?, BtsCodes?, Comment?, (EgySent | EgyTB1 | EgyTB3Start |\r\n" + 
				"EgyTB3End | EgyWord | LineCount | Note | FormattingElement |\r\n" + 
				"LanguagePassage | BausteinPassage | LeipzigPassage | GlossePassage |\r\n" + 
				"Punctuation | EgyPunctuation)*)>\r\n" + 
				"<!ATTLIST EgySent Type (HS | NS) #REQUIRED >\r\n" + 
				"<!-- Sprache der Satzuebersetzung -->\r\n" + 
				"<!ATTLIST EgySent Language CDATA #IMPLIED >\r\n" + 
				"<!-- Satzauszeichnung (fÃ¼r das 3. Modul in Leipzig) -->\r\n" + 
				"<!ATTLIST EgySent Leipzig3Modul CDATA #IMPLIED >\r\n" + 
				"<!ATTLIST EgySent Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!-- alle TB2-Elemente werden in TB1 konvertiert; TB2 ist deprecated -->\r\n" + 
				"<!ELEMENT EgyTB1 (Name, BtsCodes?, Comment?, (EgySent | EgyTB1 | EgyTB3Start |\r\n" + 
				"EgyTB3End | EgyWord | LineCount | Note | FormattingElement |\r\n" + 
				"Punctuation | EgyPunctuation)*)>\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgyTB3Start (Name, BtsCodes?, Comment?)>\r\n" + 
				"<!ATTLIST EgyTB3Start Id NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyTB3Start IdRef NMTOKEN #REQUIRED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgyTB3End (Name, BtsCodes?, Comment?)>\r\n" + 
				"<!ATTLIST EgyTB3End Id NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyTB3End IdRef NMTOKEN #REQUIRED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT EgyWord (Form, Translat?, Graphics?, BtsCodes?, Comment?)>\r\n" + 
				"<!ATTLIST EgyWord WType NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord LType (B | D) #IMPLIED >\r\n" + 
				"<!ATTLIST EgyWord LKey NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord Script CDATA #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord FKey NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord WChr NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord Connect NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST EgyWord Status CDATA #REQUIRED >\r\n" + 
				"<!-- Angaben zur Reihenfolge Grapheme vs. Wortform -->\r\n" + 
				"<!ATTLIST EgyWord ReihenfolgeID NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST EgyWord Reihenfolge NMTOKEN #IMPLIED >\r\n" + 
				"<!-- Wortauszeichnung fÃ¼r das 3. Modul in Leipzig -->\r\n" + 
				"<!ATTLIST EgyWord Leipzig3Modul CDATA #IMPLIED >\r\n" + 
				"<!ATTLIST EgyWord Author CDATA #IMPLIED>\r\n" + 
				"\r\n" + 
				"<!ELEMENT Note (Value, BtsCodes?, Comment?)>\r\n" + 
				"\r\n" + 
				"<!-- Tabulator und EndOfLine -->\r\n" + 
				"<!ELEMENT FormattingElement (Value, BtsCodes?)>\r\n" + 
				"<!ATTLIST FormattingElement Type (TAB | EOL) #IMPLIED >\r\n" + 
				"\r\n" + 
				"<!ELEMENT Punctuation (Value, BtsCodes?, Comment?)>\r\n" + 
				"\r\n" + 
				"<!-- Verspunkte und EndOfChapter -->\r\n" + 
				"<!ELEMENT EgyPunctuation (Value, BtsCodes?, Comment?)>\r\n" + 
				"<!ATTLIST EgyPunctuation Type (VP | V | DVP | EOC) #IMPLIED >\r\n" + 
				"\r\n" + 
				"<!-- Sprachstufe einer bestimmten Passage NB! \"Zwiebelproblem\", d.h. diese Passagen mÃ¼ssen nicht mit der Satzstruktur kongruent sein, sodass man diese Auszeichnung nicht in die normale Hierarchie einbauen kann -->\r\n" + 
				"<!ELEMENT LanguagePassage EMPTY>\r\n" + 
				"<!ATTLIST LanguagePassage Type (Start | End) #REQUIRED >\r\n" + 
				"<!ATTLIST LanguagePassage PassageID NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST LanguagePassage Language NMTOKEN #REQUIRED >\r\n" + 
				"\r\n" + 
				"<!-- Textbaustein einer bestimmten Passage NB! \"Zwiebelproblem\", d.h. diese Passagen mÃ¼ssen nicht mit der Satzstruktur kongruent sein, sodass man diese Auszeichnung nicht in die normale Hierarchie einbauen kann -->\r\n" + 
				"<!ELEMENT BausteinPassage EMPTY>\r\n" + 
				"<!ATTLIST BausteinPassage Type (Start | End) #REQUIRED >\r\n" + 
				"<!ATTLIST BausteinPassage PassageID NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST BausteinPassage Baustein CDATA #REQUIRED >\r\n" + 
				"<!-- Textbaustein einer bestimmten Passage fÃ¼r die Auszeichnung im 3. Modul in Leipzig NB! \"Zwiebelproblem\", d.h. diese Passagen mÃ¼ssen nicht mit der Satzstruktur kongruent sein, sodass man diese Auszeichnung nicht in die normale Hierarchie einbauen kann -->\r\n" + 
				"<!ELEMENT LeipzigPassage EMPTY>\r\n" + 
				"<!ATTLIST LeipzigPassage Type (Start | End) #REQUIRED >\r\n" + 
				"<!ATTLIST LeipzigPassage PassageID NMTOKEN #REQUIRED >\r\n" + 
				"<!ATTLIST LeipzigPassage Auszeichnung CDATA #IMPLIED >\r\n" + 
				"<!-- Textbaustein, um einen Text auszuzeichnen, der glossiert wird NB! \"Zwiebelproblem\", d.h. diese Passagen mÃ¼ssen nicht mit der Satzstruktur kongruent sein, sodass man diese Auszeichnung nicht in die normale Hierarchie einbauen kann -->\r\n" + 
				"<!ELEMENT GlossePassage EMPTY>\r\n" + 
				"<!ATTLIST GlossePassage Type (Start | End) #REQUIRED >\r\n" + 
				"<!ATTLIST GlossePassage PassageID NMTOKEN #IMPLIED >\r\n" + 
				"<!ATTLIST GlossePassage Script CDATA #REQUIRED >\r\n" + 
				"\r\n" + 
				"]>";
		return prefix;
	}
}
