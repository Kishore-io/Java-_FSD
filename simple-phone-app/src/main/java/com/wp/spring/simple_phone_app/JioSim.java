package com.wp.spring.simple_phone_app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Scope("prototype")
public class JioSim implements Sim {
	
	public JioSim() {
		System.out.println("Jio Bean Created");
	}

	@Override
	public void call(long phNumber) {
		// TODO Auto-generated method stub
		System.out.println("Making a call to "+phNumber);
		
	}

	@Override
	public void sendSMS(String msg, long phNumber) {
		// TODO Auto-generated method stub
		System.out.println("Send A Text message of ["+msg+"] to "+phNumber);	
	}

}
