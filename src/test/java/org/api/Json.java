package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	public static void main(String[] args) throws IOException, ParseException {
		
	FileReader reader = new FileReader("C:\\Users\\Test\\eclipse-workspace\\API\\src\\test\\resources\\Jsons\\json.json");
	JSONParser parser = new JSONParser();
	Object obj = parser.parse(reader);
	JSONObject jobj = (JSONObject) obj;
	Object data = jobj.get("data");
	JSONObject iobj = (JSONObject) data;
	Object firstname = iobj.get("first_name");
	System.out.println(firstname);
	Object lastname = iobj.get("last_name");
	System.out.println(lastname);
	Object id = iobj.get("id");
	System.out.println(id);
	Object email = iobj.get("email");
	System.out.println(email);
	Object avatar = iobj.get("avatar");
	System.out.println(avatar);	
	Object support = jobj.get("support");
	JSONObject kobj =(JSONObject) support;
	Object url = kobj.get("url");
	System.out.println(url);
	Object text = kobj.get("text");
	System.out.println(text);
	
			
			
	
	}
}
