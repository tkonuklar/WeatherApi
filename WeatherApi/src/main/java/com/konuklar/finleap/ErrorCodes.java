package com.konuklar.finleap;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public enum ErrorCodes {
    SUCCESS(0),
    VALIDATION_ERROR(1),
    HTTP_ERROR(2),
    SERVER_ERROR(3);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    int getCode() {
        return code;
    }
}