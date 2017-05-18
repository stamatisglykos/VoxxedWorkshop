package com.example.VoxxedSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VoxxedSumApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void Sum() {
		VoxxedSumController sum = new VoxxedSumController();
		int result = sum.sum(1, 2);
		
		assertEquals(3,  result);
	}

}
