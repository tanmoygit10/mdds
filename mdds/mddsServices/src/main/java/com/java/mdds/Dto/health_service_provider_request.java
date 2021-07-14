package com.java.mdds.Dto;

public class health_service_provider_request {
	
	
	 private int type_code;
	 private String  type_name;
	 private String registration_authority_name;
	public int getType_code() {
		return type_code;
	}
	public void setType_code(int type_code) {
		this.type_code = type_code;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getRegistration_authority_name() {
		return registration_authority_name;
	}
	public void setRegistration_authority_name(String registration_authority_name) {
		this.registration_authority_name = registration_authority_name;
	}
	@Override
	public String toString() {
		return "health_service_provider_request [type_code=" + type_code + ", type_name=" + type_name
				+ ", registration_authority_name=" + registration_authority_name + "]";
	}
	public health_service_provider_request(int type_code, String type_name, String registration_authority_name) {
		super();
		this.type_code = type_code;
		this.type_name = type_name;
		this.registration_authority_name = registration_authority_name;
	}

}
