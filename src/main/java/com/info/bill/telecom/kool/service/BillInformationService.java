package com.info.bill.telecom.kool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.bill.telecom.kool.model.BillInfo;
import com.info.bill.telecom.kool.repository.BillInfoRepository;

@Service
public class BillInformationService {
	
	@Autowired
	BillInfoRepository repo;
	
	public BillInfo getBillInfo(String billId)
	{
		if (repo.findById(billId).isPresent())
			return repo.findById(billId).get();
		else
			return null;
	}

	public List<BillInfo> getBillInfoByAccountId(String accountId) {
		if (null != repo.findByAccountId(accountId) || repo.findByAccountId(accountId).size() > 0)
			return repo.findByAccountId(accountId);
		else
			return null;
	}

}
