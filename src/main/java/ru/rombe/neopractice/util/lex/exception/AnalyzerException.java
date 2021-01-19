package ru.rombe.neopractice.util.lex.exception;

import java.util.Arrays;

public class AnalyzerException extends Exception {
    private final AnalyzerErrorCodes errorCode;
    private final String[] additionalInfo;

    public AnalyzerException(AnalyzerErrorCodes errorCode, String... additionalInfo) {
        this.errorCode = errorCode;
        this.additionalInfo = additionalInfo;
    }

    public AnalyzerErrorCodes getErrorCode() {
        return errorCode;
    }

    public String[] getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public String toString() {
        return "AnalyzerException{" +
                "errorCode=" + errorCode +
                ", additionalInfo=" + Arrays.toString(additionalInfo) +
                '}';
    }
}