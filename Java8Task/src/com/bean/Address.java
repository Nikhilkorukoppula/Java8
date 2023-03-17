package com.bean;

public class Address {
private String city,dist;
private int pincode;
public Address(String city, String dist, int pincode) {
	super();
	this.city = city;
	this.dist = dist;
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", dist=" + dist + ", pincode=" + pincode + "]";
}

}
