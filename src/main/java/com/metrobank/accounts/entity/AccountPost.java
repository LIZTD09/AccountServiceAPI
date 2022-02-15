package com.metrobank.accounts.entity;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class AccountPost {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="CustomerName", nullable=false)
    private String customerName;

    @Column(name="CustomerMobile", nullable=false)
    private String customerMobile;

    @Column(name="CustomerEmail", nullable=false)
    private String customerEmail;

    @Column(name="Address1", nullable=false)
    private String address1;

    @Column(name="Address2")
    private String address2;

    public AccountPost() {
    }

    public AccountPost(String customerName, String customerMobile, String customerEmail, String address1, String address2) {
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}
