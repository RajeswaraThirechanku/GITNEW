package org.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.pojo.Data;
import org.pojo.Support;
import org.pojo.pojo3;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperArray {
	public static void main(String[] args) throws StreamReadException,IOException {
		File src = new File("C:\\Users\\Test\\eclipse-workspace\\API\\src\\test\\resources\\Jsons\\ListUser.json");
		ObjectMapper mapper = new ObjectMapper();
		pojo3 i = mapper.readValue(src, pojo3.class);
		int page = i.getPage();
		System.out.println(page);
		int per_page = i.getPer_page();
		System.out.println(per_page);
		int total = i.getTotal();
		System.out.println(total);
		int total_pages = i.getTotal_pages();
		System.out.println(total_pages);
		ArrayList<Data> data = i.getData();
		for (Data j : data) {
			System.out.println(j.getId());
			System.out.println(j.getEmail());
			System.out.println(j.getFirst_name());
			System.out.println(j.getLast_name());
			System.out.println(j.getAvatar());
			
		}
		Support support = i.getSupport();
		String text = support.getText();
		System.out.println(text);
		String url = support.getUrl();
		System.out.println(url);
		
		
		
	}

}
