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

@Table (name = "health_service_provider_type", schema = "mdds")
public class health_service_provider_type {
	
	
	@Id
	 private int type_code;
	 private String  type_name;
	 private String registration_authority_name;
	 private int is_display;
	 
	

}
