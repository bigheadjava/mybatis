package com.cheer.model;

public class User {

	private Integer id;

	private String userName;

	private String userPassword;

	private String name;

	private String gender;

	private Integer grade;

	private String telNo;

	private String lotteryFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getLotteryFlag() {
		return lotteryFlag;
	}

	public void setLotteryFlag(String lotteryFlag) {
		this.lotteryFlag = lotteryFlag;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: ").append(id).append("\r\n");
		sb.append("userName: ").append(userName).append("\r\n");
		sb.append("userPassword: ").append(userPassword).append("\r\n");
		sb.append("name: ").append(name).append("\r\n");
		sb.append("gender: ").append(gender).append("\r\n");
		sb.append("grade: ").append(grade).append("\r\n");
		sb.append("telNo: ").append(telNo).append("\r\n");
		sb.append("lotteryFlag: ").append(lotteryFlag).append("\r\n");
		return sb.toString();
	}

}
