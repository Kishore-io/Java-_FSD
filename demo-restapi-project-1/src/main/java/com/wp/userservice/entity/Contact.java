package com.wp.userservice.entity;

public class Contact {

	private int cId;
	private String email;
	private String cname;
	private int userid;
	public Contact(int cId, String email, String cname, int userid) {
		super();
		this.cId = cId;
		this.email = email;
		this.cname = cname;
		this.userid = userid;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
}
