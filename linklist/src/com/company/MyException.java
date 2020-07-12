package com.company;


import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.InputMismatchException;
import java.util.List;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyException() {
    }
    public MyException(Throwable cause) {
        super(cause);
    }




}
