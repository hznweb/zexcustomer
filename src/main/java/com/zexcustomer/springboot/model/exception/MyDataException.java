package com.zexcustomer.springboot.model.exception;

public class MyDataException extends RuntimeException {
    public MyDataException(){super();}

    public MyDataException(String message){super(message);}

    public MyDataException(String message,Throwable cause){super(message, cause);}

    public MyDataException(Throwable causr){super(causr);}
}
