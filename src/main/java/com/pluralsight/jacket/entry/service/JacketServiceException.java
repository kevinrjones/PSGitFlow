package com.pluralsight.jacket.entry.service;

public class JacketServiceException extends RuntimeException {
    public JacketServiceException(String message) {
        super(message);
    }

    public JacketServiceException(String message, Exception ex) {
        super(message, ex);
    }
}
