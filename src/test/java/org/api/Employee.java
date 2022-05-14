package org.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.pojo.Datas;
import org.pojo.ListUser;
import org.pojo.Supports;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Test\\eclipse-workspace\\API\\src\\test\\resources\\Jsons\\Vasu.json");
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Datas>data= new ArrayList<Datas>();
		Datas s1 = new Datas(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
		Datas s2 = new Datas(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
		Datas s3 = new Datas(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		Datas s4 = new Datas(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
		Datas s5 = new Datas(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
		Datas s6 = new Datas(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
		data.add(s1);
		data.add(s2);
		data.add(s3);
		data.add(s4);
		data.add(s5);
		data.add(s6);
		ArrayList<Supports> support = new ArrayList<Supports>();
		Supports a1 = new Supports("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
		support.add(a1);

		


		
		
		ListUser u = new ListUser(2, 6, 12, 2, data, support);
		mapper.writeValue(file,u );
		
		
	}

}
