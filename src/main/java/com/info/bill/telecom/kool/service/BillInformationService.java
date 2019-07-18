package com.info.bill.telecom.kool.service;

import java.util.List;
import java.util.Optional;

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
		Optional<BillInfo> billInfo = repo.findById(billId);
		if (billInfo.isPresent())
			return billInfo.get();
		else
			return null;
	}

	public List<BillInfo> getBillInfoByAccountId(String accountId) {
		
		List<BillInfo> billInfo = repo.findByAccountId(accountId);
		
		if (null != billInfo && billInfo.size() > 0)
			return billInfo;
		else
			return null;
	}

}
