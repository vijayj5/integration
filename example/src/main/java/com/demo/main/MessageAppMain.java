package com.demo.main;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class MessageAppMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		MessageChannel channel = context.getBean("msgChannel",MessageChannel.class);
		Message<String> msg = MessageBuilder.withPayload("hello").build();
		channel.send(msg);
	}

}
