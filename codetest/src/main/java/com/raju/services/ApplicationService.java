package com.raju.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.model.Application;
import com.raju.repository.ApplicationRepository;

@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationRepository appRepo;

	public Application getAppCodeByVersion(Long appCode, String version) {
		
		return appRepo.findByAppCodeAndVersion(appCode, version);
		
		
	}

	public Application save(Application application) {
		
		return appRepo.save(application);
	}

	public Application updateProps(Application application) {
		Application updatedApplication = appRepo.getOne(application.getId());
		updatedApplication = application;
		appRepo.save(updatedApplication);
		
		return updatedApplication;
	}

	public Application updateProps2(HashMap[] properties, Long appCode, String version) {
		
		Application application = appRepo.findByAppCodeAndVersion(appCode, version);
		application.setProperties(properties);
		appRepo.save(application);
		return application;
	}

	public List<Application> getVersionsByDate(Long appCode) {
		
		
			
		return appRepo.findByAppCodeOrderByModifiedDateDesc(appCode);
		
	
		
		
	}

}
