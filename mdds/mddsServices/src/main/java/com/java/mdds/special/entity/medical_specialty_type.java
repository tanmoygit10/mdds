package com.java.mdds.special.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString

@Table (name = "medical_specialty_type", schema = "mdds")
public class medical_specialty_type {
	
	
	@Id
	private String  type_code;
	private String  type_name;
	private String  type_code_1;
	private int is_display;

}
