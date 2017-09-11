package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.DeptDao;

import lombok.extern.java.Log;

@SpringBootApplication
@ComponentScan("com.example")			//지정 없으면 메인 패키지만 뒤지는데, 스캔으로 뒤질 패키지 지정
@Log
public class DeptApplication2 implements CommandLineRunner{

	@Autowired
	DeptDao dao;
	
	public static void main(String[] args) {

		SpringApplication.run(DeptApplication2.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		log.info("@@@@");
		log.info("@@@@" + DeptApplication2.class);
		log.info("@@@@");

		dao.selectAll().forEach(e -> {
			
			log.info(e.toString());
//			System.out.println(e);		         // 내부 반복자 무명 구현 객체를 반복 호출
			
		});
		
		
		log.info("####");
		log.info("####");
		log.info("####");
		
		
	}

}
