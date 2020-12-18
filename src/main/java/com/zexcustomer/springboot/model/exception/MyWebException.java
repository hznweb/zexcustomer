package com.zexcustomer.springboot.model.exception;

public class MyWebException extends RuntimeException {
    public MyWebException(){super();}

    public MyWebException(String message){super(message);}

    public MyWebException(String message,Throwable cause){super(message, cause);}

    public MyWebException(Throwable cause){super(cause);}

}
