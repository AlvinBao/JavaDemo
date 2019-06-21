package com.hulu;

public class EmailMessageService implements MessageService {
    @Override
    public void send(String receiver, String body) {
        System.out.printf("Email from %s: %s", receiver, body);
        System.out.println();
    }
}
