package com.bean;

public class MobileNumber {
 private String motherno;
 private String fatherno;
public MobileNumber(String motherno, String fatherno) {
	super();
	this.motherno = motherno;
	this.fatherno = fatherno;
}
public String getMotherno() {
	return motherno;
}
public void setMotherno(String motherno) {
	this.motherno = motherno;
}
public String getFatherno() {
	return fatherno;
}
public void setFatherno(String fatherno) {
	this.fatherno = fatherno;
}
@Override
public String toString() {
	return "MobileNumber [motherno=" + motherno + ", fatherno=" + fatherno + "]";
}

}
