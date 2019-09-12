package com.idwxy.exindex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.idwxy.exindex.dao")
public class ExindexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExindexApplication.class, args);
	}

}
