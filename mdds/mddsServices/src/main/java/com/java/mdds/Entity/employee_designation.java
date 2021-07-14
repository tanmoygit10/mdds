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

@Table (name = "employee_designation", schema = "mdds")
public class employee_designation {
	
	
	@Id
	 String  designation_code;
	 String  designation_name;
	
	

}
