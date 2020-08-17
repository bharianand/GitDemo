package com.builderdesignPattern;

public class VechileBuilder {
	private String engine;
	private int wheel;
	
	private int airBag;
	
	/*public VechileBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	public VechileBuilder setWheel(int wheel) {
		this.wheel = wheel;
		return this;
	}
*/
	
	public VechileBuilder setAirBag(int airBag) {
		this.airBag = airBag;
		return this;
	}


	public VechileBuilder(String engine, int wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}


	public Vechile getVechileBuilder(){
		return new Vechile(engine,wheel,airBag);
		
	}
}
