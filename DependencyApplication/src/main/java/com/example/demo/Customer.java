package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int cid;
	private String cname;
	private String course;
	
	@Autowired 
	private Technology techDetail;
	
	public Technology getTech() {
		return techDetail;
	}
	public void setTech(Technology tech) {
		this.techDetail = tech;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("Customer Object Returned Successfully");
		techDetail.tech();
	}

}
