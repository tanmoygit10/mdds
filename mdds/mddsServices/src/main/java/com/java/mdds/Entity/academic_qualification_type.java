package com.java.mdds.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor

@Table (name = "academic_qualification_type", schema = "mdds")
public class academic_qualification_type {
	@Id
	private String  type_code;
	private String  type_name;
	
	
	
	

}

