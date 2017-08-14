package com.springjms.activemq.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by krishna1bhat on 8/13/17.
 */
@Configuration
@ComponentScan(basePackages = "com.springjms.activemq")
@Import({MessagingConfiguration.class})
public class AppConfig {
	
	//Put Other Application configuration here.
}
