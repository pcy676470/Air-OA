package com.oa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitRunner implements ApplicationRunner {
 
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		 System.err.println("------------InitRunner--------------------");
		 
	}
   
	 
}
   
     