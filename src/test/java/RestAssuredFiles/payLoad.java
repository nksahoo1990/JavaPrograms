package RestAssuredFiles;

public class payLoad {
	
	public static String getPostData() {
		
		String b ="{"+
				  "\"location\": {"+
				    "\"lat\": -33.8669710,"+
				    "\"lng\": 151.1958750"+
				  "},"+
				  "\"accuracy\": 50,"+
				  "\"name\": \"Google Shoes!\","+
				  "\"phone_number\": \"(02) 9374 4000\","+
				  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				  "\"types\": [\"shoe_store\"],"+
				  "\"website\": \"http://www.google.com.au/\","+
				  "\"language\": \"en-AU\""+
				"}";
		return b;
	}
	
	public static String addBook(String isbn,String aisle) {
		
		String inputData="{\r\n\r\n\"name\":\"Krushna Boook\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"Cena Sahoo\"\r\n}\r\n";
		return inputData;
		
	}

}
