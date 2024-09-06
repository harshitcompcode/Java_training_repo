package com.graymatter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.graymatter.controller.HelloController;

@SpringBootTest
class DemoTestProjectApplicationTests {

	@Autowired
	HelloController helloController;
	
	@Test
	void contextLoads() {
		assertThat(helloController).isNotNull();
	}

}
