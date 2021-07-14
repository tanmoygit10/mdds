package com.java.mdds.Dto;


public class MddsDesignationRequest {
	private String  designation_code;
	private String  designation_name;
	public String getDesignation_code() {
		return designation_code.trim();
	}
	public void setDesignation_code(String designation_code) {
		this.designation_code = designation_code;
	}
	public String getDesignation_name() {
		return designation_name.trim();
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	@Override
	public String toString() {
		return "MddsDesignationRequest [designation_code=" + designation_code + ", designation_name=" + designation_name
				+ "]";
	}
	public MddsDesignationRequest(String designation_code, String designation_name) {
		super();
		this.designation_code = designation_code;
		this.designation_name = designation_name;
	}
	

}
