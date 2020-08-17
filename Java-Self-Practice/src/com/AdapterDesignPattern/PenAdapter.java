package com.AdapterDesignPattern;

import com.hari.testDoc.PilotPen;

public class PenAdapter implements Pen{

	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		// System.out.println(str);
		String str1 = pp.mark(str);
		System.out.println(str1);
	}
}
