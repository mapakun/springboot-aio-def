package com.mini.sample;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mini.sample.vo.SampleReqVO;
import com.mini.sample.vo.SampleResVO;

@CrossOrigin
@RestController
public class helloController {
	
	@Autowired
	private HellowService hellowService;
	

	@RequestMapping(value = "/api/test", method = RequestMethod.POST)
	public List<String> hello(){
		System.out.print("test");
		return Arrays.asList("처음으로", "받습니당");
    }
	
	@RequestMapping(value = "/api/dbtest", method = RequestMethod.POST)
	public SampleResVO dbTest(@RequestBody SampleReqVO reqVO) throws Exception {
		
		SampleResVO resVO = new SampleResVO();
		
		hellowService.dbTest(resVO);
		
		return resVO;
	}
	
}
