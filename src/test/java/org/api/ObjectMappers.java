package org.api;

import java.io.File;
import java.io.IOException;

import org.pojo.Pojo2;
import org.pojo.pojo1;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMappers {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File src = new File("C:\\Users\\Test\\eclipse-workspace\\API\\src\\test\\resources\\Jsons\\json.json");
		ObjectMapper mapper = new ObjectMapper();
		Pojo2 a = mapper.readValue(src, Pojo2.class);
		pojo1 b = a.getData();
		int id = b.getId();
		System.out.println(id);
		String email = b.getEmail();
		System.out.println(email);
		String first_name = b.getFirst_name();
		System.out.println(first_name);
		String last_name = b.getLast_name();
		System.out.println(last_name);
		String avatar = b.getAvatar();
		System.out.println(avatar);
		pojo1 c = a.getSupport();
		String text = c.getText();
		System.out.println(text);
		String url = c.getUrl();
		System.out.println(url);
		
		
	}

}
