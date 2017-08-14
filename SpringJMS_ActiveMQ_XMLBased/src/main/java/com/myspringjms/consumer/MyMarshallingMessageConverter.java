package com.myspringjms.consumer;

import org.springframework.jms.support.converter.MarshallingMessageConverter;
import org.springframework.jms.support.converter.MessageConversionException;

import javax.jms.JMSException;
import javax.jms.Message;

/**
 * Created by krishna1bhat on 8/14/17.
 */
public class MyMarshallingMessageConverter
        extends MarshallingMessageConverter {
    @Override
    public Object fromMessage(Message message)
            throws JMSException, MessageConversionException{
        return super.fromMessage(message);
    }
}