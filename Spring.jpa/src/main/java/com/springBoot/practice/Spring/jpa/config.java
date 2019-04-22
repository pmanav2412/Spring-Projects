package com.springBoot.practice.Spring.jpa;

import java.io.File;

import javax.sql.DataSource;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.springBoot.practice.Spring")
@PropertySource("classpath:application.properties")
public class config {
	
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUsername("root");
	    dataSource.setPassword("rootroot");
	    dataSource.setUrl(
	      "jdbc:mysql://localhost:3306/Web?createDatabaseIfNotExist=true"); 
	   
	    
	     
	    return dataSource;
	}
	
	
	
//	  @Bean
//	    public DataSource getDataSource() {
//	        @SuppressWarnings("rawtypes")
//			DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//	        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
//	        dataSourceBuilder.url("jdbc:mysql://localhost:3306/Web?createDatabaseIfNotExist=true");
//	        dataSourceBuilder.username("root");
//	        dataSourceBuilder.password("rootroot");
//	        return dataSourceBuilder.build();
//	    }

}



//======= in properties file ============
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//spring.datasource.username=mysqluser
//spring.datasource.password=mysqlpass
//spring.datasource.url=
//  jdbc:mysql://localhost:3306/myDb?createDatabaseIfNotExist=true