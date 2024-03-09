package com.nhnacademy.springbootminidooray3accountapi.service;

import com.nhnacademy.springbootminidooray3accountapi.Dto.AccountRequest;
import com.nhnacademy.springbootminidooray3accountapi.entity.Account;
import com.nhnacademy.springbootminidooray3accountapi.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("accountservice")
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(AccountRequest request) {
        return accountRepository.save(request.toEntity());
    }


    public void deleteAccount(String id) {
    }


    public Account modifyAccount(Account account){
        return null;
    }

}