package vij;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class hashmap {

	@Test(dataProvider = "hash",enabled=false)
	public void hashex(HashMap<String, String> input)

	{
		System.out.println(input.get("email"));
		System.out.println(input.get("pass"));
		System.out.println(input.get("prod"));

	}

	@DataProvider
	public Object[][] hash() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "vkrk@fgmail.com");
		map.put("pass", "vkrk");
		map.put("prod", "adidas");
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "2vkkkkrk@fgmail.com");
		map1.put("pass", "2vkrk");
		map1.put("prod", "2adidas");
		return new Object[][] { { map }, { map1 } };

	}
	
	
	@Test(dataProvider="simpledata",enabled=false)
	public void getdata(String name,String name2,String name3)
	{
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		
		
	}
	
	@DataProvider
	public Object[][] simpledata()
	{
		return new Object[][] {{"vijay","kumar","rama"},{"a","b","c"}};
	}
	
	
	
	
	
	
	
	
	@Test(dataProvider="jsondata")
	public void jsdata(HashMap<String, String> input ) {
		System.out.println(input.get("email"));
		System.out.println(input.get("pass"));
		System.out.println(input.get("prod"));
	}
	
	@DataProvider
	public Object[][] jsondata() throws IOException
	{
		List<HashMap<String, String>> d=readjson(System.getProperty("user.dir")+"\\src\\vij\\data.json");
		return new Object[][] {{d.get(0)},{d.get(1)}};
		
		
	}
	
	
	
	public List<HashMap<String, String>> readjson(String path) throws IOException {
		String jscontent=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\vij\\data.json"),StandardCharsets.UTF_8);
		ObjectMapper maps=new ObjectMapper();
		
		List<HashMap<String,String>>hashdata=maps.readValue(jscontent,new TypeReference<List<HashMap<String,String>>>(){
			
		});
		return hashdata;	
		
	}
	
	
	


}
