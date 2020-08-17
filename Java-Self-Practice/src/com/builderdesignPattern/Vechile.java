package com.builderdesignPattern;

public class Vechile {

	private String engine;
	private int wheel;
	
	private int airBag;

	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirBag() {
		return airBag;
	}

	public Vechile(String engine, int wheel, int airBag) {
		super();
		this.engine = engine;
		this.wheel = wheel;
		this.airBag = airBag;
	}

	@Override
	public String toString() {
		return "Vechile [engine=" + engine + ", wheel=" + wheel + ", airBag="
				+ airBag + "]";
	}

	
	
}
