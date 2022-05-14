package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArray { 
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("C:\\Users\\Test\\eclipse-workspace\\API\\src\\test\\resources\\Jsons\\ListUser.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(reader);
		JSONObject i =(JSONObject) obj;
	//	System.out.println(i);
		Object page = i.get("page");
		System.out.println(page);
		Object perpage = i.get("per_page");
		System.out.println(perpage);
		Object total = i.get("total");
		System.out.println(total);
		Object totalpages = i.get("total_pages");
		System.out.println(totalpages);
		Object data = i.get("data");
		JSONArray a =(JSONArray) data;
		for (int j = 0; j < a.size(); j++) {
			//System.out.println(a.get(j));
			Object dataobject = a.get(j);
			JSONObject k =(JSONObject) dataobject;
			System.out.println(k.get("id"));
			System.out.println(k.get("email"));
			System.out.println(k.get("first_name"));
			System.out.println(k.get("last_name"));
			System.out.println(k.get("avatar"));
			
		}
		
		
		
	}

}
