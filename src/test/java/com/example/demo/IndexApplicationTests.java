package com.example.demo;

import com.example.demo.controller.IndexController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(
		classes = DemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class IndexApplicationTests {

	private MockMvc mockMvc;

	@BeforeEach
	void setUp() {
		IndexController controller = new IndexController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	void testIndexEndpoint() throws Exception {
		mockMvc.perform(get("/index"))
				.andExpect(status().isOk())
				.andExpect(content().string("Greetings from Spring Boot!"));
	}

//	@Test
//	void testIndexEndpointReturnsCorrectContentType() throws Exception {
//		mockMvc.perform(get("/index"))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType("text/plain;charset=UTF-8"));
//	}

	@Test
	void testIndexEndpointMapping() throws Exception {
		mockMvc.perform(get("/index"))
				.andExpect(status().isOk())
				.andExpect(content().string("Greetings from Spring Boot!"));
	}
}
