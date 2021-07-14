package com.java.mdds.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.java.mdds.Dto.health_service_provider_request;
import com.java.mdds.Entity.health_service_provider_type;


public interface MddsHealthProvider  extends JpaRepository<health_service_provider_type, String> {
	
	@Query("select new com.java.mdds.Dto.health_service_provider_request(e.type_code, e.type_name,e.registration_authority_name) from health_service_provider_type e where e.is_display=?1   order by type_name asc " )


	public List<health_service_provider_request> getMedicalhealthprovider(int is_dispaly);

}
