package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.entity.Reg;
import com.sample.demo.repository.RegRespository;

@Service
public class RegServicesImpl implements RegServices {

	
	@Autowired
	private RegRespository repository;
	@Override
	public Reg insertDate(Reg userreg) {
		// TODO Auto-generated method stub
		//insert into users
		return repository.save(userreg);
	}
	
	
	//get all records
	@Override
	public List<Reg> getAlldata() {
		// TODO Auto-generated method stub
		return repository.findAll() ;
	}

	//get particular
	@Override
	public Reg getoneRec(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	
	//delete
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}


	////update
	@Override
	public Reg update(Long id, Reg userreg) {
	
		Reg userid=repository.findById(id).get();
		userid.setUserName(userreg.getUserName());
		userid.setUserAddress(userreg.getUserAddress());
		return repository.save(userid);
	
	}	
	

}
