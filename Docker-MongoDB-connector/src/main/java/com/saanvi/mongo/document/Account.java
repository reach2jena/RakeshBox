package com.saanvi.mongo.document;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Accounts")
public class Account {
	
	
	@org.springframework.data.annotation.Id
	private String Id;
	private String customerName;
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerCin() {
		return customerCin;
	}


	public void setCustomerCin(String customerCin) {
		this.customerCin = customerCin;
	}


	public String getCustomerAcctno() {
		return customerAcctno;
	}


	public void setCustomerAcctno(String customerAcctno) {
		this.customerAcctno = customerAcctno;
	}


	private String customerAddress;
	private String customerCin;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String customerAcctno;
	public String getId() {
		return Id;
	}

	
	public void Account(String custname, String cin, String address, String acctno)
	{
		this.customerCin=cin;
		this.customerAddress=address;
		this.customerAcctno=acctno;
		this.customerName=custname;
	}

	

}
