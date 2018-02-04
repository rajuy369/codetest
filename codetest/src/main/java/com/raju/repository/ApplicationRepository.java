package com.raju.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raju.model.Application;
import java.lang.Long;
import java.util.List;
import java.util.Date;
@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {
	
	public Application findByAppCodeAndVersion(Long appCode,String version);
	
	public List<Application> findByAppCodeOrderByModifiedDateDesc(Long appcode);
	
	
	
	
	
	
}
