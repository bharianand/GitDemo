package com.AdapterDesignPattern;

public class AdaptorDesignPatternTest {
	public static void main(String ar[]){
		WebDriver wd = new ChromeDriver();
		wd.getElement();
		wd.selectElement();
		
		IEAdapter iea = new IEAdapter();
		iea.findElement();
		iea.chooseElement();
		
		WebDriver wad = new WebAdapterDriver(iea);
		wad.getElement();
		wad.selectElement();
	}
}
