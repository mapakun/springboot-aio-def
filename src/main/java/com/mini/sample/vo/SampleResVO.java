package com.mini.sample.vo;

import java.util.List;
import java.util.Map;

public class SampleResVO {

	private Map<String, Object> commonOutDTO;
	private List<Map<String, Object>> commonOutListDTO;
	
	public Map<String, Object> getCommonOutDTO() {
		return commonOutDTO;
	}
	public void setCommonOutDTO(Map<String, Object> commonOutDTO) {
		this.commonOutDTO = commonOutDTO;
	}
	public List<Map<String, Object>> getCommonOutListDTO() {
		return commonOutListDTO;
	}
	public void setCommonOutListDTO(List<Map<String, Object>> commonOutListDTO) {
		this.commonOutListDTO = commonOutListDTO;
	}
		
}
