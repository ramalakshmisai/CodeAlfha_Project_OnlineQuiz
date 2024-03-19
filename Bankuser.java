package com.ty;

public class Bankuser {
  private String accno;
  private String name;
  private String gender;
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
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
public Bankuser(String accno, String name, String gender) {
	super();
	this.accno = accno;
	this.name = name;
	this.gender = gender;
}
@Override
public String toString() {
	return "Bankuser [accno=" + accno + ", name=" + name + ", gender=" + gender + "]";
}
}
