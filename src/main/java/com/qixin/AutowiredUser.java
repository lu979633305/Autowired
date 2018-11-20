package com.qixin;

public class AutowiredUser {
   private String userName;
   private int age;
   private String sex;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public AutowiredUser(String userName, int age, String sex) {
	super();
	this.userName = userName;
	this.age = age;
	this.sex = sex;
}



public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public AutowiredUser() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "AutowiredUser [userName=" + userName + ", age=" + age + ", sex=" + sex + "]";
}


   
}
