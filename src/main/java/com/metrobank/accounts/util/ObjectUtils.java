package com.metrobank.accounts.util;

import org.springframework.stereotype.Component;

@Component
public class ObjectUtils {

    public void checkObjectIsNull(String accountType, String accountId, Object object) throws Exception{
        if(object == null){
            throw new RecordNotFoundException(accountType, accountId);
        }
    }

}
