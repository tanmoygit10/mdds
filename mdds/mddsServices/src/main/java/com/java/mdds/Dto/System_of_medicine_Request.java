package com.java.mdds.Dto;



public class System_of_medicine_Request {
	
	
	private String  medicine_code;
	private String  medicine_name;
	public String getMedicine_code() {
		return medicine_code.trim();
	}
	public void setMedicine_code(String medicine_code) {
		this.medicine_code = medicine_code;
	}
	public String getMedicine_name() {
		return medicine_name.trim();
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public System_of_medicine_Request(String medicine_code, String medicine_name) {
		super();
		this.medicine_code = medicine_code;
		this.medicine_name = medicine_name;
	}
	@Override
	public String toString() {
		return "System_of_medicine_Request [medicine_code=" + medicine_code + ", medicine_name=" + medicine_name + "]";
	}
	

}
