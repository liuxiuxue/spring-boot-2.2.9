package com.star.springbootmytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		// 1.肯定是main方法最先执行
		// 2.肯定是先有Spring容器
		// 3.解析相关自动注入的类进入IOC
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
