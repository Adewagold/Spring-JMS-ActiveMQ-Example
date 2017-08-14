package com.myspringjms.consumer;

import com.myspringjms.message.MessageObject;

/**
 * Created by krishna1bhat on 8/14/17.
 */
public class MessageConsumerBean {
    public void onMessage(MessageObject message) {
        try {
            System.out.println("Mail # "+message.getMessage()+" received.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}