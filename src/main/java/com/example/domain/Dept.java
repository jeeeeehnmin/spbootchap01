package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

	int deptno;
	String dname;
	String loc;

	
	/*
	 * 빈에 등록하는 방
	 * xml
	 * @Component
	 * @Bean
	 */
}
