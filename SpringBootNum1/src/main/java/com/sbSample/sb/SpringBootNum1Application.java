package com.sbSample.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootNum1Application {
	
	public static String getStr(String str) throws Exception{	
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNum1Application.class, args);
		try {
			System.out.println(SpringBootNum1Application.getStr("hi"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
