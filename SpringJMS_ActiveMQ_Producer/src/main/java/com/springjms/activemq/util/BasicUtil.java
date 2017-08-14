package com.springjms.activemq.util;

import java.util.UUID;

/**
 * Created by krishna1bhat on 8/13/17.
 */
public class BasicUtil {
	public static String getUniqueId(){
		return UUID.randomUUID().toString();
	}
}
