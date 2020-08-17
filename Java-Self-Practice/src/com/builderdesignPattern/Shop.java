package com.builderdesignPattern;

public class Shop {
	public static void main(String ar[]){
		Phone p = new PhoneBuilder().setScreenSize(5.5).setOS("Android").getPhone();
		System.out.println(p);
	}
}
