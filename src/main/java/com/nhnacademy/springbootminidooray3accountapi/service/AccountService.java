package com.nhnacademy.springbootminidooray3accountapi.service;

import com.nhnacademy.springbootminidooray3accountapi.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();

    Account createAccount();

    void deleteAccount(String id);

    Account modifyAccount(Account account);
}
