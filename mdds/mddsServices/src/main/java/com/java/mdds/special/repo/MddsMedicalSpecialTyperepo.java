package com.java.mdds.special.repo;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.java.mdds.Dto.MedicalspecialtypeRequest;
import com.java.mdds.special.entity.medical_specialty_type;




public interface MddsMedicalSpecialTyperepo extends JpaRepository<medical_specialty_type, String> {

@Query("select new com.java.mdds.Dto.MedicalspecialtypeRequest(e.type_code, e.type_name,e.type_code_1) from medical_specialty_type e   order by type_name asc " )


    public List<MedicalspecialtypeRequest> getMedicalspecialtypeInfo();
@Query("select new com.java.mdds.Dto.MedicalspecialtypeRequest(e.type_code, e.type_name,e.type_code_1) from medical_specialty_type e where e.is_display=?1   order by type_name asc " )


public List<MedicalspecialtypeRequest> getMedicalspecialtypeInfo1(int is_dispaly);

}
