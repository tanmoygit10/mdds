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

@Table (name = "system_of_medicine", schema = "mdds")

public class system_of_medicine {
	
	@Id
	private String  medicine_code;
	private String  medicine_name;
	private int for_nic_use;

}
