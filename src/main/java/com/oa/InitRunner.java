package com.oa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.oa.dao.AppOrgGroupDao;

@Component
public class InitRunner implements ApplicationRunner {

	@Autowired
	AppOrgGroupDao appOrgGroupDao;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		 System.out.println("------------InitRunner--------------------");
		 System.err.println(appOrgGroupDao.toString());
	 
		 
	}
   
	 
}
   
     