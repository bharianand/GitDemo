package com.AdapterDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{

	@Override
	public void giveBankDetails() {
		// TODO Auto-generated method stub
		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter Account Holder Name :");
			String customerName = brr.readLine();
			System.out.println("\n");
			
			System.out.println("Enter Account Holder Number :");
			String customerAccNo = brr.readLine();
			System.out.println("\n");
			
			System.out.println("Enter Bank Name :");
			String customerBankName = brr.readLine();
			System.out.println("\n");
			
			setAccHolderName(customerName);
			setAccHolderNum(customerAccNo);
			setBankName(customerBankName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		// TODO Auto-generated method stub
		return ("The account No "+getAccHolderNum()+" of "+getAccHolderName()+" in "
				+getBankName()+" bank is valid and authenticated for issuing the credit card");
	}

}
