package com.mini.sample;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class helloController {

	@RequestMapping(value = "/api/test", method = RequestMethod.POST)
	public List<String> Hello(){
		System.out.print("test");
		return Arrays.asList("처음으로", "받습니당");
    }
	
}
