package com.metrobank.accounts.entity.request;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AccountGetRequest {

    	private String customerNumber;

    public AccountGetRequest() {
    }

    public AccountGetRequest(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
