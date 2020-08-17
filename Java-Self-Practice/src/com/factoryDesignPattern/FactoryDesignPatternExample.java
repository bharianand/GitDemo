package com.factoryDesignPattern;

public class FactoryDesignPatternExample {
	public static void main(String ar[]){
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem os = osf.getInstance("open");
		os.spec();
	}
}
