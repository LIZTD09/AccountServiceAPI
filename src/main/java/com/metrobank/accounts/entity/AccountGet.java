package com.metrobank.accounts.entity;

import java.util.List;

public class AccountGet {

    private String customerNumber;
    private AccountPost accountPost;
    private List<Savings> savings;
    private TransactionStatus transactionStatus;

    public AccountGet() {
    }

    public AccountGet(String customerNumber, AccountPost accountPost, List<Savings> savings, TransactionStatus transactionStatus) {
        this.customerNumber = customerNumber;
        this.accountPost = accountPost;
        this.savings = savings;
        this.transactionStatus = transactionStatus;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public AccountPost getAccountPost() {
        return accountPost;
    }

    public void setAccountPost(AccountPost accountPost) {
        this.accountPost = accountPost;
    }

    public List<Savings> getSavings() {
        return savings;
    }

    public void setSavings(List<Savings> savings) {
        this.savings = savings;
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
                "customerNumber:'" + customerNumber + '\'' +
                ", accountPost:" + accountPost +
                ", savings:" + savings +
                ", transactionStatus:" + transactionStatus +
                '}';
    }
}
