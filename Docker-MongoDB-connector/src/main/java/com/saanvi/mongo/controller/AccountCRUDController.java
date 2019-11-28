package com.saanvi.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.saanvi.mongo.document.Account;
import com.saanvi.mongo.repository.AccountRepository;
import com.saanvi.mongo.vo.MessageVo;


@RestController
public class AccountCRUDController {

	@Autowired
	AccountRepository acctrepo;
	@Autowired 
	private MessageVo mg;
	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	
	public @ResponseBody MessageVo addCustomerAccount(@RequestBody Account account)
	{
		
		System.out.println(" values "+account);
		
		acctrepo.save(account);
		mg.setMsr("Account added successfully "+account.getId());
		return mg;
	}
	@RequestMapping(value = "/getAccounts", method = RequestMethod.GET)
	
	public @ResponseBody MessageVo getAllAccounts()
	{
		mg.setAcctlist(acctrepo.findAll());
		return mg;
	}
}
