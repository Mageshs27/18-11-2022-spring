package com.sample.demo.service;

import java.util.List;

import com.sample.demo.entity.Reg;

public interface RegServices {

	
	public Reg insertDate(Reg userreg);
	public List<Reg>getAlldata();
	public Reg getoneRec(Long id);
	public void delete(Long id);
	public Reg update(Long id,Reg usereg);
	
	
}
