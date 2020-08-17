package com.observerDesignPattern;

public interface Observer {

	public abstract void update();

	public abstract void subscribeChannel(Subject ch);

}