package com.demo.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="msgService")
public class MessageService {
	@ServiceActivator(inputChannel="msgChannel", autoStartup="true")
	public void processMsg(Message<String> msg){
		System.out.println(msg.getPayload());
	}
}
