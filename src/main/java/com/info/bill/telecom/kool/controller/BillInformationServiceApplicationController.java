package com.info.bill.telecom.kool.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.info.bill.telecom.kool.model.BillInfo;
import com.info.bill.telecom.kool.service.BillInformationService;

import io.swagger.annotations.Api;

@RestController
@Api(value="BillInformationServiceApplicationController", description="Operations pertaining to client account bill information")

public class BillInformationServiceApplicationController {
	
	@Autowired
	BillInformationService service;
	
	private Logger logger = LoggerFactory.getLogger(BillInformationServiceApplicationController.class);
	
    @GetMapping("/bill-info-service/bills/{billId}")
    public BillInfo getBill(@PathVariable String billId) {
       logger.info("I am in getBills");
       return service.getBillInfo(billId);
    }
    
    @GetMapping("/bill-info-service/searchByAccount/{accountId}")
    public List<BillInfo> getBillByAccount(@PathVariable String accountId) {
       logger.info("I am in getBills");
       return service.getBillInfoByAccountId(accountId);
    }

}
