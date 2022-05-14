package org.pojo;

import java.util.ArrayList;

import org.baseclass.Baseclass;

public class PetPojo extends Baseclass {
	public PetPojo() {
	}
	public PetPojo(int id, Category category, String name, ArrayList<String> photoUrl, ArrayList<Tags> tags,
			String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrl = photoUrl;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(ArrayList<String> photoUrl) {
		this.photoUrl = photoUrl;
	}
	public ArrayList<Tags> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Tags> tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private int id;
	private Category category;
	private String name;
	private ArrayList<String> photoUrl;
	private ArrayList<Tags>tags;
	private String status;

}
