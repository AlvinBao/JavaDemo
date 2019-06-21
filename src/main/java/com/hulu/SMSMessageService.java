package com.hulu;

public class SMSMessageService implements MessageService {
    @Override
    public void send(String receiver, String body) {
        System.out.printf("SMS from %s: %s", receiver, body);
        System.out.println();
    }
}
