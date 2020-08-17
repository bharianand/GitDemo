package com.observerDesignPattern;

public interface Subject {

	public abstract String getTitle();

	public abstract void subscribe(Subscriber sub);

	public abstract void unSubscribe(Observer sub);

	public abstract void nofitySubscriber();

	public abstract void upload(String title);

}