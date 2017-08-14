package com.myspringjms.producer;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by krishna1bhat on 8/14/17.
 */
public class MessageProducerBean extends JmsGatewaySupport{
    //Method receives String object and send
    //it to destination topic as BytesMessage
    public void sendMessage(final String myMessage) {
        getJmsTemplate().send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                //Create byte message
                BytesMessage message = session.createBytesMessage();
                message.writeBytes(myMessage.getBytes());
                return message;
            }
        });
    }
}