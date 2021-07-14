package com.java.mdds.Dto;



public class MedicalspecialtypeRequest {
	
	private String  type_code;
	private String  type_name;
	private String  type_code_1;
	public String getType_code() {
		return type_code;
	}
	public void setType_code(String type_code) {
		this.type_code = type_code;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getType_code_1() {
		return type_code_1;
	}
	public void setType_code_1(String type_code_1) {
		this.type_code_1 = type_code_1;
	}
	@Override
	public String toString() {
		return "MedicalspecialtypeRequest [type_code=" + type_code + ", type_name=" + type_name + ", type_code_1="
				+ type_code_1 + "]";
	}
	public MedicalspecialtypeRequest(String type_code, String type_name, String type_code_1) {
		super();
		this.type_code = type_code;
		this.type_name = type_name;
		this.type_code_1 = type_code_1;
	}
	
	
	
	
	

}
