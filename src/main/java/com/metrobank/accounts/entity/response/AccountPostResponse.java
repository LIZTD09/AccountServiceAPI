package com.metrobank.accounts.entity.response;

import com.metrobank.accounts.entity.TransactionStatus;
import com.metrobank.accounts.entity.request.AccountPostRequest;

public class AccountPostResponse {

    private int customerNumber;
    private TransactionStatus transactionStatus;

    public AccountPostResponse() {
    }

    public AccountPostResponse(int customerNumber, TransactionStatus transactionStatus) {
        this.customerNumber = customerNumber;
        this.transactionStatus = transactionStatus;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        return "{" +
                "customerNumber:" + customerNumber +
                ", transactionStatus:" + transactionStatus +
                '}';
    }
}
