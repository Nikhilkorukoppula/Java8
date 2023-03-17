package com.bean;

import java.util.List;

public class Student {
	  public String name;
	    public int age;
	    public String gender;
	    private int joingyear;
	    private Address address;
	    public MobileNumber mobileNumbers;
	    private List<Section>section;
	    public Student(String name, int age,String gender,int joingyear, Address address, MobileNumber mobileNumbers,List<Section> section) {
			super();
			this.name = name;
			this.age = age;
			this.gender=gender;
			this.joingyear=joingyear;
			this.address = address;
			this.mobileNumbers = mobileNumbers;
			this.section = section;
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
		
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public int getJoingyear() {
			return joingyear;
		}
		public void setJoingyear(int joingyear) {
			this.joingyear = joingyear;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public MobileNumber getMobileNumbers() {
			return mobileNumbers;
		}
		public void setMobileNumbers(MobileNumber mobileNumbers) {
			this.mobileNumbers = mobileNumbers;
		}
		public List<Section> getSection() {
			return section;
		}
		public void setSection(List<Section> section) {
			this.section = section;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", gender=" + gender + " joingyear=" + joingyear +", address=" + address
					+ ", mobileNumbers=" + mobileNumbers + ", section=" + section + "]";
		}
		
		
		
		
}
