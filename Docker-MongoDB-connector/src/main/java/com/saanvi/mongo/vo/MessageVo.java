package com.saanvi.mongo.vo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.saanvi.mongo.document.Account;
@Component("mg")
public class MessageVo {

	private String msr="";
	private List<Account> acctlist=null;

	public List<Account> getAcctlist() {
		return acctlist;
	}

	public void setAcctlist(List<Account> acctlist) {
		this.acctlist = acctlist;
	}

	public String getMsr() {
		return msr;
	}

	public void setMsr(String msr) {
		this.msr = msr;
	}
}
