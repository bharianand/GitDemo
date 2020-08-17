package com.AdapterDesignPattern;

public class AdapterPatternDemo {
	public static void main(String ar[]){
		CreditCard cc = new BankCustomer();
		cc.giveBankDetails();
		System.out.println(cc.getCreditCard());
	}
}
