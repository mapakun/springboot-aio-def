package com.mini.sample.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {
	
	/* Test */
	List<Map<String,Object>> helloTest();
	
}
