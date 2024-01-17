package com.ohgiraffers.section08.uses;

public class Member {

	private int num;
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	
	public Member() {}

	public Member(int num, String id, String pwd, String name, int age, char gender) {
		this.num = num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getNum() {
		return num;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
	
	public String getInformation() {
		return "Member [num=" + num + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}
}
