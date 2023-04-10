package com.douzone.container.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.user.User;

import config.user.AppConfig01;

public class JavaConfigTest {
	
	@Ignore
	@Test
	public void testJavaConfig01() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig01.class);

		User user = appContext.getBean(User.class);
		assertNotNull(user);
		assertEquals("신정은", user.getName());
	}
	
	@Test
	public void testJavaConfig02() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext("config.user");
		
		User user = appContext.getBean(User.class);
		assertNotNull(user);
		assertEquals("마이콜", user.getName());
	}
}
