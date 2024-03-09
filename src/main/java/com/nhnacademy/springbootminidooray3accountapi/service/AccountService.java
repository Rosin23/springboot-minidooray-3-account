package com.nhnacademy.springbootminidooray3accountapi.service;

import com.nhnacademy.springbootminidooray3accountapi.Dto.AccountRequest;
import com.nhnacademy.springbootminidooray3accountapi.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();

    Account createAccount(AccountRequest request);

    void deleteAccount(String id);

    Account modifyAccount(Account account);
}
