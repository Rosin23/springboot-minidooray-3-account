package com.nhnacademy.springbootminidooray3accountapi.controller;

import com.nhnacademy.springbootminidooray3accountapi.Dto.AccountRequest;
import com.nhnacademy.springbootminidooray3accountapi.entity.Account;
import com.nhnacademy.springbootminidooray3accountapi.service.AccountService;
import com.nhnacademy.springbootminidooray3accountapi.service.AccountServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/signup")
    public Account createAccount(@Valid @RequestBody AccountRequest request) {
        return accountService.createAccount(request);
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
