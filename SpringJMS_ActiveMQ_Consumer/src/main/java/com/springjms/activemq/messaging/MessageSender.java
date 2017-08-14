package com.springjms.activemq.messaging;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import com.springjms.activemq.model.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * Created by krishna1bhat on 8/13/17.
 */
@Component
public class MessageSender {

	@Autowired
	JmsTemplate jmsTemplate;

	public void sendMessage(final InventoryResponse inventoryResponse) {

		jmsTemplate.send((session) -> session.createObjectMessage(inventoryResponse));

	}

}
