package com.cheer.model;

import java.util.Date;

public class Role {

	private Integer id;

	private String roleName;

	private Integer enable;

	private Integer createdBy;

	private Date createdDate;
	
	private Account account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------").append("\r\n");
		if(account != null) {
			sb.append("account_name: ").append(account.getName()).append("\r\n");
		}
		sb.append("id: ").append(id).append("\r\n");
		sb.append("roleName: ").append(roleName).append("\r\n");
		sb.append("enable: ").append(enable).append("\r\n");
		sb.append("createdBy: ").append(createdBy).append("\r\n");
		sb.append("createdDate: ").append(createdDate).append("\r\n");
		sb.append("----------------------------------------").append("\r\n");
		return sb.toString();
	}
}
