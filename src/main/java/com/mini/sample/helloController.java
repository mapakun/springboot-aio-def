package com.mini.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@RequestMapping(value = "/api/test", method = RequestMethod.POST)
	public List<String> hello(){
		System.out.print("test");
		return Arrays.asList("처음으로", "받습니당");
    }
	
	@RequestMapping(value = "/api/dbtest", method = RequestMethod.POST)
	public SampleResVO dbTest(@RequestBody SampleReqVO reqVO){
		
		SampleResVO resVO = new SampleResVO();
		
		String testStr = (String)reqVO.getCommonInDTO().get("test");
		
		Map<String, Object> resMap = new HashMap<>();
		resMap.put("resTest", testStr);
		
		resVO.setCommonOutDTO(resMap);
		
		return resVO;
	}
	
}
