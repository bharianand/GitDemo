package com.factoryDesignPattern;

public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str){
		if(str.equalsIgnoreCase("open"))
			return new Android();
		else if(str.equalsIgnoreCase("close"))
			return new Ios();
		
		return new Windows();
	}
}
