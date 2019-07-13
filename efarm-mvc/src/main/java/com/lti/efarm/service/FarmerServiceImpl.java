package com.lti.efarm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.efarm.dao.FarmerDao;
import com.lti.efarm.model.Farmer;
import com.lti.efarm.service.FarmerService;


@Service
public class FarmerServiceImpl implements FarmerService {
	
	@Autowired
	private FarmerDao farmerDao;

	@Transactional
	public void saveFarmer(Farmer theFarmer)
	{
		farmerDao.saveFarmer(theFarmer);

	}

	@Transactional
	public List<Farmer> getFarmer()
	{
		return farmerDao.getFarmer();
	}

	@Transactional
	public Farmer getFarmer(int theId)
	{
		return farmerDao.getFarmer(theId);
	
	}

}
