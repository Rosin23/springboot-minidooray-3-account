package com.nhnacademy.springbootminidooray3accountapi.controller;

import com.nhnacademy.springbootminidooray3accountapi.entity.Account;
import com.nhnacademy.springbootminidooray3accountapi.service.AccountService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {


    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/signup")
    public Account createAccount() {
        return accountService.createAccount();
    }

    @GetMapping("/accounts")
    public List<Account> getAccount() {
        return accountService.getAccounts();
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(String id) {
        accountService.deleteAccount(id);
    }

}