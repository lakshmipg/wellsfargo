package com.myapp.spring.events;

import java.math.BigDecimal;

public class AccountCreatedEvent extends BaseEvent<String> {

	private final BigDecimal initialBalance;
	
	private final String accountHolder;

	public AccountCreatedEvent(String id, BigDecimal initialBalance, String accountHolder) {
		super(id);
		this.initialBalance = initialBalance;
		this.accountHolder = accountHolder;
	}

	public BigDecimal getInitialBalance() {
		return initialBalance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	
	
	
	
}
