package com.company.certification.hexacta.exceptions;

public class HexactaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public HexactaException(Exception e) {
        super(e);
    }

}
