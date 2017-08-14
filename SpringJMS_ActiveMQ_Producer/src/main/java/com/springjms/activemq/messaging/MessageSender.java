package com.springjms.activemq.messaging;

import com.springjms.activemq.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by krishna1bhat on 8/13/17.
 */
@Component
public class MessageSender {

	//NOTE:
	//ConnectionFactory->Connection->Session->MessageProducer->send

	@Autowired
	JmsTemplate jmsTemplate;

	public void sendMessage(final Product product) {

		jmsTemplate.send((session) -> session.createObjectMessage(product));//new MessageCreator()

	}

}
