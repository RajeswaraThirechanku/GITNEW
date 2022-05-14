package org.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.baseclass.Baseclass;
import org.pojo.LoginOutPutPojo;
import org.pojo.SetAddressInputPojo;
import org.rest.Endpoint;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class Authentication extends Baseclass {
	 String logtoken;
	
	@Test(priority = 1)
	public void login() throws IOException {
		header("content-Type", "application/json");
		basicAuth(getPropertyValue("username"), getPropertyValue("password"));
		Response response = responseMethodType("POST", Endpoint.LOGIN);
		System.out.println(getStatusCode(response));
		System.out.println(getResponseBodyAsPrettyString(response));
		LoginOutPutPojo loginOutputPojo = response.as(LoginOutPutPojo.class);
		logtoken = loginOutputPojo.getData().getLogtoken();
		System.out.println(logtoken);
	}
		@Test(priority = 2)
		public void SetAddress() {
			List<Header> h = new ArrayList<>();
			Header h1 = new Header("Content-Type","application/json");
			Header h2 = new Header("Authorization","Bearer "+logtoken);
			h.add(h1);
			h.add(h2);
			headers(h);
			SetAddressInputPojo setAddressOutputPojo = new SetAddressInputPojo("Rajeswara", "Thirechanku", "7871275366", "RD PG", 1, 1, 1, "600907", "chennai", "Home");
			body(setAddressOutputPojo);
			Response response = responseMethodType("POST", Endpoint.ADDADDRESS);
			
			
			
}
		

}
		

