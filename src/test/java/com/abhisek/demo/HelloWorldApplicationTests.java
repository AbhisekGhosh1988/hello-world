package com.abhisek.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
class HelloWorldApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void messageTest() throws Exception {

		mockMvc.perform(get("/hello")).andExpect(status().isOk());
	}

	@Test
	public void testMain() {
		HelloWorldApplication.main(new String[] {});
		assertThat(true);
	}

}

