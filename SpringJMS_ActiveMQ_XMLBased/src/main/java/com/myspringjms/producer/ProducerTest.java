package com.myspringjms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna1bhat on 8/14/17.
 */


//RESOURCE: https://github.com/half-wit4u/MyBlog/tree/master/MySpringJMSTopic_OXM
public class ProducerTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("appProdContext.xml");
        MessageProducerBean mp = (MessageProducerBean)
                context.getBean("producer");
        String msg = "<messageobject><mailid>skhan</mailid>"+
                "<message>Hello Topic!</message></messageobject>";
        mp.sendMessage(msg);
        System.out.println("Message sent to destination");
    }
}