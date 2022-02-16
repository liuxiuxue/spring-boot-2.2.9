package com.star.springbootmytest;

import com.star.CustomBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMytestApplicationTests {

	@Autowired
	CustomBean customBean;

	@Test
	void contextLoads() {
	}

	@Test
	public void test1(){

		System.out.println(customBean);
		System.out.println("customBean");
	}

}
