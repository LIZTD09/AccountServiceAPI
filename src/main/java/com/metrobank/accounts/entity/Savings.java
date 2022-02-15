package com.metrobank.accounts.entity;

import javax.persistence.*;

@Entity
@Table(name = "SAVINGS")
public class Savings {

	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false)
	private int id;

	@Column(name="AccountNumber")
	private int accountNumber;

	@Column(name="AccountType", nullable=false)
	private AccountType accountType;

	@Column(name="AvailableBalance")
	private int availableBalance;


	public Savings() {
		super();
	}

	public Savings(int accountNumber, AccountType accountType, int availableBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}
}
