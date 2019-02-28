package com.oa;

import java.sql.SQLException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oa")
public class Application {

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(Application.class, args);
        
	}

}
