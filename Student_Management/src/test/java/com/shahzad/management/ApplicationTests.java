package com.shahzad.management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import com.shahzad.management.service.UserServiceImpl;



@SpringBootTest
class ApplicationTests {
	
	private UserServiceImpl userSvc;
	
	@Autowired
	public ApplicationTests(
			UserServiceImpl userSvc
			) {
		this.userSvc = userSvc;
	}

	@Test
	void contextLoads() {
		assertNotNull(userSvc);
	}
	
	@Test
	void testUserServiceCurrentUser() {
		UserDetails ud = userSvc.loadUserByUsername("sgh@gmail.com");
		assertNotNull(ud);
		assertEquals("sgh@gmail.com", ud.getUsername());
	}

}
