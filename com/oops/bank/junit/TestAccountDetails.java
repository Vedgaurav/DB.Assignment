package com.oops.bank.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oops.bank.account.Account;
import com.oops.bank.account.impl.FdAccount;
import com.oops.bank.account.impl.HomeLoanAccount;
import com.oops.bank.account.impl.SavingsAccount;
import com.oops.bank.dao.AccountDao;
import com.oops.bank.dao.impl.AccountDaoImpl;
import com.oops.bank.details.AccountDetails;


public class TestAccountDetails {
	
	
	Account savingsAccount = new SavingsAccount();
	Account fdAccount = new FdAccount();
	Account homeLoanAccount = new HomeLoanAccount();
	
	AccountDetails accountDetails1 = new AccountDetails();
	AccountDetails accountDetails2 = new AccountDetails();
	AccountDetails accountDetails3 = new AccountDetails();
	
	AccountDao accountDao = new AccountDaoImpl();
	
	@Test
	public void testCalculateInterestSavingsAccount()
	{
		accountDetails1.setAccountType("savings");
		accountDetails1.setAmount(5000);
		accountDetails1.setYear(3);
		accountDetails1.setCif(1002);
		
		
		
		double interest = savingsAccount.calInterest(accountDetails1);
		
		assertEquals(750,interest,0.0);
		
	}
	
	@Test
	public void testCalculateInterestFdAccount()
	{
		accountDetails2.setAccountType("fd");
		accountDetails2.setAmount(5000);
		accountDetails2.setYear(3);
		accountDetails2.setCif(1002);
		
		
		
		double interest = fdAccount.calInterest(accountDetails2);
		
		assertEquals(750,interest,0.0);
		
	}

	@Test
	public void testCalculateInterestHomeLoanAccount()
	{
		accountDetails3.setAccountType("homeloan");
		accountDetails3.setAmount(5000);
		accountDetails3.setYear(3);
		accountDetails3.setCif(1002);
		
		
		
		double interest = homeLoanAccount.calInterest(accountDetails3);
		
		assertEquals(750,interest,0.0);
		
	}

}
