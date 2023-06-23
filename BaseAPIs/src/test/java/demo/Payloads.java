package demo;

public class Payloads {

	public static String AddPlaceBody()
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"VIJAYS house\",\r\n"
				+ "  \"phone_number\": \"(+91) 9848471222\",\r\n"
				+ "  \"address\": \"29, BMK RICE MILL ROAD\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"myzone shop \",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"TELUGU-IN\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String Course()
	{
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String AddBookPayload(String isbn, String aisle)
	{
		String payload="{\r\n"
				+ "\r\n"
				+ "\"name\":\"APIi Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"vijaay\"\r\n"
				+ "}\r\n"
				+ "";
		return payload;
			
	}

	

}
