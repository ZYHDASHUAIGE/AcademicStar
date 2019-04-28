package com.imooc;

//import java.net.InetAddress;
//import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.imooc.mapper")
@ComponentScan(basePackages= {"com.imooc","org.n3r.idworker"})

public class Application{
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		String host = null;
//		try {
//			host = InetAddress.getLocalHost().getHostAddress();
//		}catch(UnknownHostException e) {
//			
//		}
//		System.out.println(host);
		
	}

	
	
	
}
