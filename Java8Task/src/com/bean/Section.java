package com.bean;

public class Section {
private String sectionname;

public Section(String sectionname) {
	super();
	this.sectionname = sectionname;
}
public String getSectionName() {
	return sectionname;
}
public void setSectionName(String sectionname) {
	this.sectionname = sectionname;
}

@Override
public String toString() {
	return " [section=" + sectionname + "]";
}

}
