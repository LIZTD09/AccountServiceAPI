package com.metrobank.accounts.entity;

public class TransactionStatus {
	private int transactionStatusCode;
	private String transactionStatusDescription;


	public TransactionStatus() {
		super();
	}


	public int getTransactionStatusCode() {
		return transactionStatusCode;
	}


	public void setTransactionStatusCode(int transactionStatusCode) {
		this.transactionStatusCode = transactionStatusCode;
	}


	public String getTransactionStatusDescription() {
		return transactionStatusDescription;
	}


	public void setTransactionStatusDescription(String transactionStatusDescription) {
		this.transactionStatusDescription = transactionStatusDescription;
	}


	@Override
	public String toString() {
		return "T{" +
				"transactionStatusCode:" + transactionStatusCode +
				", transactionStatusDescription:'" + transactionStatusDescription + '\'' +
				'}';
	}
}
