package com.mini.sample;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.sample.mapper.HelloMapper;
import com.mini.sample.vo.SampleResVO;

@Service
public class HellowService {

	@Autowired
	private HelloMapper helloMapper;
	
	public void dbTest(SampleResVO resVO) throws Exception {
		
		List<Map<String,Object>> rsListMap = helloMapper.helloTest();
		resVO.setCommonOutListDTO(rsListMap);
		
	}
	
}
