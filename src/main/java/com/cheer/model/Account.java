package com.cheer.model;

import java.util.Date;

public class Account {

	private Integer id;

	private String name;

	private String password;

	private String email;

	private Date createdDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------").append("\r\n");
		sb.append("id: ").append(id).append("\r\n");
		sb.append("accountName: ").append(name).append("\r\n");
		sb.append("accountPassword: ").append(password).append("\r\n");
		sb.append("email: ").append(email).append("\r\n");
		sb.append("createdDate: ").append(createdDate).append("\r\n");
		sb.append("----------------------------------------").append("\r\n");
		return sb.toString();
	}

}
