package com.wp.spring.simple_phone_app;

public interface Sim {
	public void call(long phNumber);
	public void sendSMS(String msg,long phNumber);
}
