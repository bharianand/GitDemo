package com.observerDesignPattern;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject channel = new Channel();
		
		Subscriber s1 = new Subscriber("sachin");
		Subscriber s2 = new Subscriber("dhoni");
		Subscriber s3 = new Subscriber("sehwaq");
		Subscriber s4 = new Subscriber("rohit");
		Subscriber s5 = new Subscriber("raina");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		channel.subscribe(s4);
		channel.subscribe(s5);
		
		// channel.unSubscribe(s3);
		
		s1.subscribeChannel(channel);
		s2.subscribeChannel(channel);
		s3.subscribeChannel(channel);
		s4.subscribeChannel(channel);
		s5.subscribeChannel(channel);
		
		channel.upload("How to Learn Programming..");
		
		
	}

}
