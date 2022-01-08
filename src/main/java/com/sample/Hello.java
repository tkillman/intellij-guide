package com.sample;

public class Hello {

    private String message;

    private String addMessage;

    public Hello(String message, String addMessage) {
        this.message = message;
        this.addMessage = addMessage;
    }

    public void sayHi(){
        System.out.println(this.message + this.addMessage);
    }
}
