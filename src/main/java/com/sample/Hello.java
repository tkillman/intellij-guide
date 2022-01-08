package com.sample;

import java.util.Optional;

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

    public String strReturn (String str){
        return str;
    }
    public void test (){
        System.out.println(Optional.ofNullable(strReturn("hi")).orElseGet(()-> "aa"));
    }
    public void moveError (){
        return;
        // return "";
    }
}
