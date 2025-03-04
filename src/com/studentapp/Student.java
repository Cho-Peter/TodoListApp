package com.studentapp;

public class Student implements Comparable<Student>{

	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Student [no=" + this.no + ", name=" + this.name + ", age=" + this.age + "]";
		
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}