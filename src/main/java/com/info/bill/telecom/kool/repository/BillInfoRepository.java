/***************************************
 ** @author		Abhishek Chakraborty
 ** @codeName	abhisheky2a
 ** @Date		25 May 2019	
 ***************************************/


package com.info.bill.telecom.kool.repository;

import com.info.bill.telecom.kool.model.BillInfo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillInfoRepository extends MongoRepository<BillInfo, String>
{
	public List<BillInfo> findByAccountId(String accountId);
}
