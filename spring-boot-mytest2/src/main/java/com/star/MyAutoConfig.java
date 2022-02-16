package com.star;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: liuxiuxue
 * @date: 2022/2/15 15:53
 */
@Configuration
@ConditionalOnBean(OpenClose.class)
public class MyAutoConfig {


	@Bean
	CustomBean customBean() {
		return new CustomBean();
	}
}
