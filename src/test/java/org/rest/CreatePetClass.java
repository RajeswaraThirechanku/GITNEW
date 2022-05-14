package org.rest;
import java.util.ArrayList;

import org.baseclass.Baseclass;
import org.pojo.Category;
import org.pojo.PetPojo;
import org.pojo.Tags;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreatePetClass extends Baseclass {
	Response response;
	@Test
	public void post() {
		header("Content-Type", "application/json");
		body("{\r\n" + "  \"id\": 9222968140497187000,\r\n" + "  \"category\": {\r\n" + "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n" + "  },\r\n" + "  \"name\": \"doggie\",\r\n" + "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n" + "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n" + "    }\r\n" + "  ],\r\n" + "  \"status\": \"available\"\r\n"
				+ "}");
		Response response = responseMethodType("POST", "https://petstore.swagger.io/v2/pet");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		System.out.println(getResponseBodyAsString(response));
		System.out.println(getResponseBodyAsPrettyString(response));

	}

	@Test
	public void post1() {
		header("accept", "application/json");
		body("{\r\n" + "  \"code\": 400,\r\n" + "  \"type\": \"unknown\",\r\n"
				+ "  \"message\": \"org.jvnet.mimepull.MIMEParsingException: Missing start boundary\"\r\n" + "}");
		Response response = responseMethodType("POST", "https://petstore.swagger.io/v2/pet/0/uploadImage");
		System.out.println(getStatusCode(response));
		

	}
	@Test
	private void post2() {
		header("Content-Type", "application/json");
		Category category = new Category(20, "Buffalo");
		ArrayList<Tags>tag = new ArrayList<Tags>();
		Tags t1 = new Tags(10, "monkey");
		Tags t2 = new Tags(20, "donkey");
		tag.add(t1);
		tag.add(t2);
		ArrayList<String> photoUrl =new ArrayList<String>();
		photoUrl.add("www.donkey.com");
		photoUrl.add("www.mokey.com");
		PetPojo create = new PetPojo(100, category, "Dog", photoUrl, tag, "available");
		body(create);
		Response Type = responseMethodType("POST", "https://petstore.swagger.io/v2/pet");
		int statusCode = getStatusCode(Type);
		System.out.println(statusCode);
		String asPrettyString = getResponseBodyAsPrettyString(Type);
		System.out.println(asPrettyString);
		PetPojo Petpojooutput = response.as(PetPojo.class);
		String name = Petpojooutput.getCategory().getName();
		System.out.println(name);
		

}
}
