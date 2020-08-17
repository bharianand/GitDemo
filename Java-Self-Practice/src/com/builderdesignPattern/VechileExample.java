package com.builderdesignPattern;

public class VechileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile car = new VechileBuilder("1500cc",4).setAirBag(3).getVechileBuilder();
		Vechile bike = new VechileBuilder("180cc",2).getVechileBuilder();
		
		// Vechile car1 = new Vechile.VechileBuilder("1500cc",4).setAirBag(4).build();
		
		// System.out.println(car.getEngine()+" "+car.getWheel()+" "+car.getAirBag());
		
		// System.out.println(bike.getEngine()+" "+bike.getWheel()+" "+bike.getAirBag());
		
		System.out.println(car);
		System.out.println(bike);
	}

}
