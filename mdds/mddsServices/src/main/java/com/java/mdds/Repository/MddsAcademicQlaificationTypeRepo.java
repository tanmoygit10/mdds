package com.java.mdds.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.mdds.Dto.AcademicQlaificationTypeRequest;
import com.java.mdds.Entity.academic_qualification_type;

public interface MddsAcademicQlaificationTypeRepo extends JpaRepository<academic_qualification_type, String>  {

@Query("select new com.java.mdds.Dto.AcademicQlaificationTypeRequest(e.type_code,e.type_name) from academic_qualification_type e   order by type_name asc " )
	
    public List<AcademicQlaificationTypeRequest> getqualificationtypeinfo();
@Query("select new com.java.mdds.Dto.AcademicQlaificationTypeRequest(e.type_code,e.type_name) from academic_qualification_type e where e.type_code=?1   order by type_name asc " )

public List<AcademicQlaificationTypeRequest> getqualificationtypeinfo1(String qualtype);
}
