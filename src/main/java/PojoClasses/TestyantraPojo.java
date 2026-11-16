package PojoClasses;

public class TestyantraPojo {
	String name;
	String area;
	String pincode;
	String city;
	String karnataka;
	
	public TestyantraPojo()
	{
		
	}
	
	public TestyantraPojo(String name,String area,String pincode, String  city, String karnataka)
	{
		this.name=name;
		this.area=area;
		this.pincode=pincode;
		this.city=city;
		this.karnataka=karnataka;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getKarnataka() {
		return karnataka;
	}

	public void setKarnataka(String karnataka) {
		this.karnataka = karnataka;
	}
	
	

}
