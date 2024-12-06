package com.example.aco_bot;

public class Message {
    public static String Sent_by_me="me";
    public static String Sent_by_bot="bot";
    String message;
    String sentby;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }


    public Message(String message, String sentby) {
        this.message = message;
        this.sentby = sentby;
    }


}
