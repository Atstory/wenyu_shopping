package com.yuan.newbeecopy.common;

public class NewBeeException extends RuntimeException{
    public NewBeeException(){

    }
    public NewBeeException(String message) {
        super(message);
    }
    public static void fail(String message){
        throw new NewBeeException(message);
    }
}
