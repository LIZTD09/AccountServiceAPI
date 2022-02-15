package com.metrobank.accounts.entity.request;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AccountPostRequest {

    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String address2;
    private String address1;

    public AccountPostRequest() {
    }

    public AccountPostRequest(String customerName, String customerMobile, String customerEmail, String address2, String address1) {
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address2 = address2;
        this.address1 = address1;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "{" +
                "customerName:'" + customerName + '\'' +
                ", customerMobile:'" + customerMobile + '\'' +
                ", customerEmail:'" + customerEmail + '\'' +
                ", address2:'" + address2 + '\'' +
                ", address1:'" + address1 + '\'' +
                '}';
    }
}
