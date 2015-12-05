package com.pluralsight.jacket.entry.exceptions;

/**
 * Created by Kevin Jones on 05/12/2015.
 */
public class JacketException extends RuntimeException {
    public JacketException(String message, Exception ex) {
        super(message, ex);
    }
}
