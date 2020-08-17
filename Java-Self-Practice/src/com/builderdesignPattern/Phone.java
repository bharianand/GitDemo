package com.builderdesignPattern;

public class Phone {
	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int batter;
	
	public Phone(String oS, int ram, String processor, double screenSize,
			int batter) {
		super();
		OS = oS;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.batter = batter;
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", ram=" + ram + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", batter=" + batter + "]";
	}
	
	
}
