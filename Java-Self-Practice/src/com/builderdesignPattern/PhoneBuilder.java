package com.builderdesignPattern;

public class PhoneBuilder {
	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int batter;
	
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBatter(int batter) {
		this.batter = batter;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(OS,ram,processor,screenSize,batter);
	}
}
