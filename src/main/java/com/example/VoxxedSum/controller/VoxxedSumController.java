package com.example.VoxxedSum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoxxedSumController {
	
	@RequestMapping("/sum")
	public int sum(@RequestParam("a") int a, @RequestParam("b")  int b){
		return a+b;
	}
	
	
}
