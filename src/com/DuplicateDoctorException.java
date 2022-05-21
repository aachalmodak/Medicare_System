package com;

public class DuplicateDoctorException extends Exception {

    public DuplicateDoctorException() {
        super();
    }

    public String getMessage() {
        return "Doctor with same Reg No Exist in System";
    }
}