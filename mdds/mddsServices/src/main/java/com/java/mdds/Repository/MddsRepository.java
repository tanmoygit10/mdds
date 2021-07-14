package com.java.mdds.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.mdds.Dto.MddsDesignationRequest;
import com.java.mdds.Entity.employee_designation;



public interface MddsRepository extends JpaRepository<employee_designation, String> {
	@Query("select new com.java.mdds.Dto.MddsDesignationRequest(e.designation_code,e.designation_name) from employee_designation e where e.designation_code=?1  order by designation_name asc " )
	
    public List<MddsDesignationRequest> getDesignationInfo(String desid);
	
@Query("select new com.java.mdds.Dto.MddsDesignationRequest(e.designation_code,e.designation_name) from employee_designation e   order by designation_name asc " )
	
    public List<MddsDesignationRequest> getDesignationInfo1();

@Query("select new com.java.mdds.Dto.MddsDesignationRequest(e.designation_code,e.designation_name) from employee_designation e where is_doctor=1   order by designation_name asc " )

public List<MddsDesignationRequest> getDoctorDesignationInfo();

@Query("select new com.java.mdds.Dto.MddsDesignationRequest(e.designation_code,e.designation_name) from employee_designation e where e.designation_code=?1 and is_doctor=?2  order by designation_name asc " )

public List<MddsDesignationRequest> getDoctorDesignationInfo1(String desid,int isdoc);

}
