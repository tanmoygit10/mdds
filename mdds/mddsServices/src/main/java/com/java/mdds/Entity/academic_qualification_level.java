package com.java.mdds.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
@Table (name = "academic_qualification_level", schema = "mdds")

public class academic_qualification_level {
	
	
	@Id
	private String  level_code;
	private String  level_name;
	private int for_ehos_use;
	
	
	
	

}
