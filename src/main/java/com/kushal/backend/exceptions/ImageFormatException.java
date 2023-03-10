package com.kushal.backend.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

public class ImageFormatException extends Exception {

    public ImageFormatException(String message) {
        super(message);
    }

    public ImageFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImageFormatException(Throwable cause) {
        super(cause);
    }

    protected ImageFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
