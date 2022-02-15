package com.metrobank.accounts.service;

import com.metrobank.accounts.entity.AccountPost;
import com.metrobank.accounts.repository.AccountPostRepository;
import com.metrobank.accounts.util.ModelUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountPostRepository accountPostRepository;

//    private SavingsRepository savingsRepository;

    private ModelUtils modelUtils;

//    public AccountService(AccountPostRepository accountPostRepository, SavingsRepository savingsRepository, ModelUtils modelUtils) {
//        this.accountPostRepository = accountPostRepository;
//        this.savingsRepository = savingsRepository;
//        this.modelUtils = modelUtils;
//    }


//    public Object getAllAccount() {
//        return accountPostRepository.findAll();
//    }
//
//    public AccountPost saveAccount(AccountPostRequest accountPostRequest) {
//        return accountPostRepository.saveAndFlush(modelUtils.createAccountModel(accountPostRequest));
//    }

//    public List<AccountPost> getAllAccount() {
//        return accountPostRepository.findAll();
//    }

//    public AccountPost getAccount1Id(int id){
//        return accountPostRepository.findById(id).orElseThrow();
//        // This returns an Optional orElseThrow will create an error if nothing is found
//    }

    public  List<AccountPost> getAllAccount() {
        return accountPostRepository.findAll();
    }

    public AccountPost getAccountId(int id){
        return accountPostRepository.findById(id);
        // This returns an Optional orElseThrow will create an error if nothing is found
    }

    public void addAccount(AccountPost accountPost) {
        accountPostRepository.save(accountPost);
    }

    public AccountPost updateAccount(AccountPost AccountPost) {
        return accountPostRepository.save(AccountPost);
    }

    public void deleteAccount(int id) {
        accountPostRepository.deleteById(id);
    }

}

//    public void addAccount(AccountPost accountPost) {
//        accountPostRepository.save(accountPost);
//    }
//
//    public AccountPost updateAccount(AccountPost accountPost) {
//        return accountPostRepository.save(accountPost);
//    }
//
//    public void deleteAccount(int id) {
//        accountPostRepository.deleteById(id);
//    }
//}

//
//    public Object getByCustomerNumber(int customerNumber) {
//        return savingsRepository.findByCustomerNumber(customerNumber);
//    }
