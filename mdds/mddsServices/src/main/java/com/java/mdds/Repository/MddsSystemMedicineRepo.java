package com.java.mdds.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.java.mdds.Dto.System_of_medicine_Request;
import com.java.mdds.Entity.system_of_medicine;



public interface MddsSystemMedicineRepo extends JpaRepository<system_of_medicine, String> {

@Query("select new com.java.mdds.Dto.System_of_medicine_Request(e.medicine_code,e.medicine_name) from system_of_medicine e where for_nic_use=1   order by medicine_name asc " )
	
    public List<System_of_medicine_Request> getsystemMedicineInfo();
}
