package com.wipro.app.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.wipro.app.exception.RecordNotfoundException;
import com.wipro.app.service.impl.AssignmentServiceImpl;

@RunWith(SpringRunner.class)
public class AssignmentServiceTests {

	
	@InjectMocks
	private AssignmentServiceImpl phoneDirectoryService;

	
	@Test
	public void testGetPalindrome() {
		Assert.assertNotNull(phoneDirectoryService.getPalindrome("HelloWelcomeemoclewHelloolle"));
	}
	
	@Test
	public void testGetPhoneDirectoryNameSuccess() {
		Assert.assertNotNull(phoneDirectoryService.getPhoneDirectoryName("Kumer"));
	}
	
	@Test(expected = RecordNotfoundException.class)
	public void testGetPhoneDirectoryNameFailed() {
		Assert.assertNotNull(phoneDirectoryService.getPhoneDirectoryName("ZZZ"));
	}
}
