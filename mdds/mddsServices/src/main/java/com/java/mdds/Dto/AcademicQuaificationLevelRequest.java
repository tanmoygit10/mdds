package com.java.mdds.Dto;

public class AcademicQuaificationLevelRequest {
	private String  level_code;
	private String  level_name;
	public String getLevel_code() {
		return level_code.trim();
	}
	public void setLevel_code(String level_code) {
		this.level_code = level_code;
	}
	public String getLevel_name() {
		return level_name.trim();
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public AcademicQuaificationLevelRequest(String level_code, String level_name) {
		super();
		this.level_code = level_code;
		this.level_name = level_name;
	}
	@Override
	public String toString() {
		return "AcademicQuaificationLevelRequest [level_code=" + level_code + ", level_name=" + level_name + "]";
	}
	

}
