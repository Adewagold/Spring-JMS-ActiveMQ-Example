package com.myspringjms.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by krishna1bhat on 8/14/17.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MessageObject")
public class MessageObject implements Serializable{

    @XmlElement(name = "mailId")
    private String mailId;

    @XmlElement(name = "message")
    private String message;

    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}