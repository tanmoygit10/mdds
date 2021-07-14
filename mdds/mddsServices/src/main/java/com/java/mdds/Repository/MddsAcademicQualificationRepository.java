package com.java.mdds.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.mdds.Dto.AcademicQuaificationLevelRequest;
import com.java.mdds.Entity.academic_qualification_level;









public interface MddsAcademicQualificationRepository extends JpaRepository<academic_qualification_level, String> {

@Query("select new com.java.mdds.Dto.AcademicQuaificationLevelRequest(e.level_code,e.level_name) from academic_qualification_level e where e.level_code=?1 and e.for_ehos_use=?2  order by level_name asc " )
	
    public List<AcademicQuaificationLevelRequest> getqualificationInfo(String qualid,int is_id);
@Query("select new com.java.mdds.Dto.AcademicQuaificationLevelRequest(e.level_code,e.level_name) from academic_qualification_level e where e.for_ehos_use=1   order by level_name asc " )

public List<AcademicQuaificationLevelRequest> getqualificationInfo1();
}
