package com.learn.gradle;


import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}