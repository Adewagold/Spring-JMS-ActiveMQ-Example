package com.myspringjms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna1bhat on 8/14/17.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("appConsumerContext.xml");
        System.out.println("Consumer listening !!!!!!");
    }
}