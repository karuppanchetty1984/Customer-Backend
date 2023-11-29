package com.customers.app.error;

public class CustomersNotFoundException extends Exception{

    public CustomersNotFoundException() {
        super();
    }

    public CustomersNotFoundException(String message) {
        super(message);
    }

    public CustomersNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomersNotFoundException(Throwable cause) {
        super(cause);
    }

    protected CustomersNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
