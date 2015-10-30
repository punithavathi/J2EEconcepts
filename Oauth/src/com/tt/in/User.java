package com.tt.in;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class User

{
	@Persistent
	private String name;
	@Persistent
	private String mailid;
	@Persistent
	private String picture;
	@Persistent
	private Date date;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}


public Date getDate() {
	return date;
}

public void setDate(Date date2) {
	this.date = date2;
}
}

