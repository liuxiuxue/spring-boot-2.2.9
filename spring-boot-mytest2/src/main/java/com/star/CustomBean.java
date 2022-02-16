package com.star;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: liuxiuxue
 * @date: 2022/2/15 15:21
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "custombean")
public class CustomBean {

	private int age;

	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("CustomBean{");
		sb.append("age=").append(age);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
