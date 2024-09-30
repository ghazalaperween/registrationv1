package com.registrationPrac.exception;

import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg) {
        super(msg);// call the constructor of parent class .This is parent class RuntimeException.
        // this is child class ResourceNotFoundException.
    }
}
