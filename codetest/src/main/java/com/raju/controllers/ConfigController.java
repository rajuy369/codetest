package com.raju.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raju.model.Application;
// import com.raju.repository.ApplicationRepository;
import com.raju.services.ApplicationService;

@RestController
@RequestMapping("/api")
public class ConfigController {
	
	@Autowired
	private ApplicationService appService;
	// @Autowired
	// private ApplicationRepository appRepo;  
	
	
	// return the json with given appcode and version
	
	@RequestMapping(value = "{appCode}/config/{version}", method = RequestMethod.GET)
	public Application getAppCode(@PathVariable("appCode") Long appCode, @PathVariable("version") String version) {
		
		return appService.getAppCodeByVersion(appCode,version);
		
	
		}
	
	// update the properties field with the given props in the request body object
	
	@RequestMapping(value = "{appCode}/config/{version}", method = RequestMethod.POST)
	public Application addAppCode(@RequestBody Application application ,@PathVariable("appCode") Long appCode, @PathVariable("version") String version) {
		
		  return appService.updateProps2(application.getProperties(),appCode,version);
				
		}
	
	
	// get the all objects based on give appcode and sorted by date in dsc order
	
	@RequestMapping(value = "{appCode}/config", method = RequestMethod.GET)
	public List<Application> getAppCodeByDate(@PathVariable("appCode") Long appCode) {
		
		
			
			return appService.getVersionsByDate(appCode);
		
		
		}
	
	/*
	 * These two methods are just to add and get the object not part of the code test
	 * 
	 * @RequestMapping(value = "", method = RequestMethod.POST)
	public void addData(@RequestBody Application application) {
		
		appRepo.save(application);
		
	}
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Application> showData() {
		
		 return appRepo.findAll();
		
	}
	*/
	
	}

