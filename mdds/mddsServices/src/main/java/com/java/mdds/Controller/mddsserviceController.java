package com.java.mdds.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mdds.Dto.AcademicQlaificationTypeRequest;
import com.java.mdds.Dto.AcademicQuaificationLevelRequest;
import com.java.mdds.Dto.MddsDesignationRequest;
import com.java.mdds.Dto.MedicalspecialtypeRequest;
import com.java.mdds.Dto.System_of_medicine_Request;
import com.java.mdds.Dto.health_service_provider_request;
import com.java.mdds.Repository.MddsAcademicQlaificationTypeRepo;
import com.java.mdds.Repository.MddsAcademicQualificationRepository;
import com.java.mdds.Repository.MddsHealthProvider;
import com.java.mdds.Repository.MddsRepository;
import com.java.mdds.Repository.MddsSystemMedicineRepo;
import com.java.mdds.special.repo.MddsMedicalSpecialTyperepo;


@RestController
@RequestMapping("/v1" )
//controller  vhg  rtey hhh

public class mddsserviceController {
	@Autowired
	private MddsRepository mddsrepository;
	@Autowired
	private MddsAcademicQualificationRepository mddsqlaifiaction;
	@Autowired
	private MddsAcademicQlaificationTypeRepo academicqlaificationtyperepo;	
	@Autowired
	private MddsSystemMedicineRepo mddsSystemmedicinerepo;
	@Autowired
	private MddsMedicalSpecialTyperepo mddsmedicalspecialtyperepo;
	@Autowired
	private MddsHealthProvider mddsmedicalprovidero;
	
	
	@GetMapping("/qualificationtype")
	public List<AcademicQlaificationTypeRequest> getqualificationtype(){
	
		  return academicqlaificationtyperepo.getqualificationtypeinfo();
	}
	@GetMapping("/qualificationtype/{qualtype}")
	public List<AcademicQlaificationTypeRequest> getqualificationtype1(@PathVariable String qualtype){
	
         return academicqlaificationtyperepo.getqualificationtypeinfo1(qualtype);
	}
	@GetMapping("/qualification")
	public List<AcademicQuaificationLevelRequest> getqualification1(){
		
		  return mddsqlaifiaction.getqualificationInfo1();
	}
	@GetMapping("/qualification/{qualid}")
	public List<AcademicQuaificationLevelRequest> getqualification(@PathVariable String qualid){
		
		  return mddsqlaifiaction.getqualificationInfo(qualid,1);
	}
	@GetMapping("/designation/{descid}")
	public List<MddsDesignationRequest> getdesignation(@PathVariable String descid){
		
		 return mddsrepository.getDesignationInfo(descid);
	}
	@GetMapping("/designation")
	public List<MddsDesignationRequest> getdesignation1(){
	
		 return mddsrepository.getDesignationInfo1();
	}
	@GetMapping("/designation/doctor")
	public List<MddsDesignationRequest> getdoctorDesignation(){
	
		 return mddsrepository.getDoctorDesignationInfo();
	}
	@GetMapping("/designation/doctor/{descid}")
	public List<MddsDesignationRequest> getdoctorDesignation1(@PathVariable String descid){
		
		 return mddsrepository.getDoctorDesignationInfo1(descid,1);
	}
	
	@GetMapping("/medicinebranch")
	public List<System_of_medicine_Request> getsystemmedicine(){
	
		 return mddsSystemmedicinerepo.getsystemMedicineInfo();
	}
	@GetMapping("/specialization")
	public List<MedicalspecialtypeRequest> getmedicalspecialtype(){
		
	
        return mddsmedicalspecialtyperepo.getMedicalspecialtypeInfo();
	}
	@GetMapping("/specialization/{disid}")
	public List<MedicalspecialtypeRequest> getmedicalspecialtype1(@PathVariable int disid){
		
	
        return mddsmedicalspecialtyperepo.getMedicalspecialtypeInfo1(disid);
	}
	@GetMapping("/healthprovider/{disid}")
	public List<health_service_provider_request> getMedicalhealthprov(@PathVariable int disid){
		
	
         return mddsmedicalprovidero.getMedicalhealthprovider(disid);
	}
	
	

}
