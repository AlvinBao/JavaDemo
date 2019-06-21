package com.hulu;

import org.springframework.beans.factory.annotation.Autowired;

public class MyXMLApplication {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void process(String receiver, String body) {
        messageService.send(receiver, body);
    }
}
