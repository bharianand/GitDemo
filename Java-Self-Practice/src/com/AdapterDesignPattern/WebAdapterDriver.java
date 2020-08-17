package com.AdapterDesignPattern;

public class WebAdapterDriver implements WebDriver{
	IEAdapter ieAdap;
	
	public WebAdapterDriver(IEAdapter ieAdap){
		this.ieAdap = ieAdap;
	}

	@Override
	public void getElement() {
		// TODO Auto-generated method stub
		ieAdap.findElement();
	}

	@Override
	public void selectElement() {
		// TODO Auto-generated method stub
		ieAdap.chooseElement();
	}
}
