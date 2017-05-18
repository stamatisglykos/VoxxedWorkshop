package com.example.VoxxedSum.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VoxxedSumControllerT {
	
	@Test
	public void Sum() {
		VoxxedSumController sumCtrl = new VoxxedSumController();
		int result = sumCtrl.sum(1, 2);
		
		assertEquals(3,  result);
	}

}
