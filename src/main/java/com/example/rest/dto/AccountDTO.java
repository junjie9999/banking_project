package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDTO {
	
    private Long AccountId;

    private int NOAccount;
    
    private Integer AccountBalance; 

    private List<Customer> customer = new ArrayList<>();

	public Long getAccountId() {
		return AccountId;
	}

	public void setAccountId(Long accountId) {
		AccountId = accountId;
	}

	public int getNOAccount() {
		return NOAccount;
	}

	public void setNOAccount(int nOAccount) {
		NOAccount = nOAccount;
	}

	public Integer getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		AccountBalance = accountBalance;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public AccountDTO(Long accountId, int nOAccount, Integer accountBalance, List<Customer> customer) {
		super();
		AccountId = accountId;
		NOAccount = nOAccount;
		AccountBalance = accountBalance;
		this.customer = customer;
	}

	public AccountDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AccountDTO [AccountId=" + AccountId + ", NOAccount=" + NOAccount + ", AccountBalance=" + AccountBalance
				+ ", customer=" + customer + "]";
	}


}
