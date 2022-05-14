package org.pojo;

import java.util.ArrayList;

public class ListUser {
	private int page;
	public ListUser(int page, int per_page, int total, int total_pages, ArrayList<Datas> data,
			ArrayList<Supports> support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Datas> data;
	private ArrayList<Supports> support;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<Datas> getData() {
		return data;
	}
	public void setData(ArrayList<Datas> data) {
		this.data = data;
	}
	public ArrayList<Supports> getSupport() {
		return support;
	}
	public void setSupport(ArrayList<Supports> support) {
		this.support = support;
	}

}
