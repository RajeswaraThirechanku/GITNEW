
package org.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	RequestSpecification reqspec;
	Response response;
	public void header(String key, String value) {
  reqspec = RestAssured.given().header(key,value);
  	}
	public void queryparam(String key, String value){
		reqspec.queryParam(key, value);
		
	}
	public void pathyparam(String key, String value){
	 reqspec = reqspec.pathParam(key, value);
		
	}
	public void body(Object data) {
		 reqspec = reqspec.body(data);
		
	}
	public Response responseMethodType(String type, String endpoint) {
		switch (type) {
		case "GET":
			 response = reqspec.get(endpoint);
			break;
		case "POST":
			 response = reqspec.post(endpoint);
			break;
		case "PUT":
			 response = reqspec.put(endpoint);
			break;
		case "DELETE":
			 response = reqspec.delete(endpoint);
			break;

		default:
			break;
		}
		return response;
		
	}
	public void headers(List<Header>h) {
		Headers headers = new Headers(h);
		 reqspec = RestAssured.given().headers(headers);
	}
	public void basicAuth(String username, String password) {
		reqspec = reqspec.auth().preemptive().basic(username, password);
		

	}                                    
	
	
	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}
	public ResponseBody getBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}
	public String getResponseBodyAsString(Response response) {
		String asString = getBody(response).asString();
		return asString;
		
		
	}
	public String getResponseBodyAsPrettyString(Response response) {
		String asPrettyString = getBody(response).asPrettyString();
		return asPrettyString;
		

	}
	public String getPropertyValue(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream stream = new FileInputStream(System.getProperty( "user.dir")+"\\src\\test\\resources\\config.properties");
		properties.load(stream);
		String value = (String) properties.get(key);
		return value;	
		}

}
