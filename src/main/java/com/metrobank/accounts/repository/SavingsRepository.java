package com.metrobank.accounts.repository;

import com.metrobank.accounts.entity.Savings;
import com.metrobank.accounts.entity.AccountGet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsRepository extends JpaRepository<Savings, Integer> {

//    AccountGet findByCustomerNumber(int customerNumber);
}
