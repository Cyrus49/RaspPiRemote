package com.example.demo.remote;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import remote.DemoApplication;
import remote.RemoteController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= RemoteController.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
