package com.ynz.democloud.guestroomservice.exceptions;

public class NoSuchRoomException extends RuntimeException{
    public NoSuchRoomException(String s) {
        super(s);
    }

    public NoSuchRoomException(CharSequence charSequence) {
        super(charSequence.toString());
    }

}
