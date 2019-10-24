package com.cheer.model;

public class Privilege {

	private Integer id;

	private String privilegeName;

	private String privilegeUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getPrivilegeUrl() {
		return privilegeUrl;
	}

	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------").append("\r\n");
		sb.append("id: ").append(id).append("\r\n");
		sb.append("privilegeName: ").append(privilegeName).append("\r\n");
		sb.append("privilegeUrl: ").append(privilegeUrl).append("\r\n");
		sb.append("----------------------------------------").append("\r\n");
		return sb.toString();
	}
}
