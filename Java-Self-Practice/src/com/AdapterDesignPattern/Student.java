package com.AdapterDesignPattern;

public class Student {
	public static void main(String ar[]){
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("hari");
	}
}
