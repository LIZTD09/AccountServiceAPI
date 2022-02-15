package com.metrobank.accounts.util;

import com.metrobank.accounts.entity.request.AccountPostRequest;
import com.metrobank.accounts.entity.AccountPost;

public class ModelUtils {

    public AccountPost createAccountModel(AccountPostRequest request){
        return new AccountPost(request.getCustomerName(), request.getCustomerMobile(), request.getCustomerEmail(), request.getAddress1(), request.getAddress2());
    }

}
