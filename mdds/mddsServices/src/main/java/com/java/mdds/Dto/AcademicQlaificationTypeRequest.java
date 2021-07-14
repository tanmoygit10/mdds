package com.java.mdds.Dto;

public class AcademicQlaificationTypeRequest {

	private String  type_code;
	private String  type_name;
	public String getType_code() {
		return type_code.trim();
	}
	public void setType_code(String type_code) {
		this.type_code = type_code;
	}
	public String getType_name() {
		return type_name.trim();
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	@Override
	public String toString() {
		return "AcademicQlaificationTypeRequest [type_code=" + type_code + ", type_name=" + type_name + "]";
	}
	public AcademicQlaificationTypeRequest(String type_code, String type_name) {
		super();
		this.type_code = type_code;
		this.type_name = type_name;
	}
	
}
