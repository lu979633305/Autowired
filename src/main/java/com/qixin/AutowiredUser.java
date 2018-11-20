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

   
}
