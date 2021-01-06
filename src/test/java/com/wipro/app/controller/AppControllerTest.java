package com.wipro.app.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.wipro.app.service.impl.AssignmentServiceImpl;

@RunWith(SpringRunner.class)
public class AppControllerTest {

	
	@InjectMocks
	private AppControllerTest appControllerTest;
	
	@Mock
	private AssignmentServiceImpl assignmentService;
	
	private MockMvc mockMvc;
	
	@Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(appControllerTest).build();
    }
		
	@Test
	public void testGetPalindromeSuccess() throws Exception {
		this.mockMvc.perform(get("/api/palindromic/{input}","HelloWelcomeemoclewHelloolle")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andReturn();
	}
	
	@Test
	public void testGetPhoneDirectoryNameSuccess() throws Exception {
		this.mockMvc.perform(get("/api/phonedirectory/{name}","Kumar")
				.contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
				.andReturn();
	}
}
