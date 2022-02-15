package com.metrobank.accounts.util;

public class RecordNotFoundException extends Exception{

    public RecordNotFoundException(String type, String id){
        super(String.format("Account not Found", type, id));
    }
}
