package com.metrobank.accounts.controller;

import com.metrobank.accounts.entity.AccountPost;
import com.metrobank.accounts.entity.request.AccountPostRequest;
import com.metrobank.accounts.repository.AccountPostRepository;
import com.metrobank.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
@Autowired
    private AccountService accountService;

    @GetMapping(value="/api/v1/hello")
    public String fetchAccount(){
        return "Hello";
    }

//    @GetMapping(value="/api/v1/account")
//    public Object getAccount(){
//        return accountService.getAllAccount();
//    }
//
//    @PostMapping(value="/api/v1/account")
//    public Object saveAccount (@RequestBody AccountPostRequest accountPostRequest){
//        return accountService.saveAccount(accountPostRequest);
//    }

    @RequestMapping("/api/v1/account")
    public List<AccountPost> getAllFamily1(){
        return accountService.getAllAccount();
    }


//    @GetMapping(value="/api/v1/account/{customerNumber}")
//    public Object getByCustomerNumber(@PathVariable int customerNumber) throws Exception{
//        return accountService.getByCustomerNumber(customerNumber);
//    }
//



    @RequestMapping(method=RequestMethod.POST, value="/api/v1/account")
    public void addFAccount(@RequestBody AccountPost accountPost){
        accountService.addAccount(accountPost);
    }

//    @RequestMapping(method=RequestMethod.GET, value="/account/{customerNumber}")
//    public AccountPost getAccountId(@PathVariable int id) {
//        return accountService.getAccountId(id);
//    }

    @RequestMapping(method=RequestMethod.PUT, value="/api/v1/account")
    public AccountPost updateAccount(@RequestBody AccountPost accountPost){
        return accountService.updateAccount(accountPost);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/api/v1/account/{id}")
    public void deleteAccount(@PathVariable("id") int id) {
        accountService.deleteAccount(id);
    }
}
