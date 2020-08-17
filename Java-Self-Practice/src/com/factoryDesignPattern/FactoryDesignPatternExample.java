package com.factoryDesignPattern;

public class FactoryDesignPatternExample {
	public static void main(String ar[]){
		System.out.println(" Println statement inside FactoryDesignPatternExample");
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem os = osf.getInstance("open");
		os.spec();
	}
}
