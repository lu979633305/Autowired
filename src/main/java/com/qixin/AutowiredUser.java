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
@Override
public String toString() {
	return "AutowiredUser [userName=" + userName + ", age=" + age + ", sex=" + sex + "]";
}

   
}
