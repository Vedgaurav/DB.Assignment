 package com.oops.bank.details;

import java.io.Serializable;

/**
 * Account type can have values like savings, current, fd, rd
 *
 */
public class AccountDetails implements Serializable{
	
	
	private static final long serialVersionUID = -1023890874428157684L;
	private int accountNumber;
	private String accountType;
	private double amount;
	private double interest;
	private double year;
	private int cif;
	private int branchId;
	private String activeStatus;
	
	public AccountDetails() {}

    public AccountDetails(int accountNumber, String accountType, double amount, double interest, double year, int cif,
			int branchId, String activeStatus) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount = amount;
		this.interest = interest;
		this.year = year;
		this.cif = cif;
		this.branchId = branchId;
		this.activeStatus = activeStatus;
	}



    public AccountDetails(int cif,int branchId, String accountType, double amount,double year) {
	
		this.cif = cif;
		this.accountType = accountType;
		this.amount = amount;
		this.year = year;
		this.branchId = branchId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
	

}
