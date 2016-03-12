package com.daniapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.daniapp.application.RpWebApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RpWebApplication.class)
@WebAppConfiguration
public class RpWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
