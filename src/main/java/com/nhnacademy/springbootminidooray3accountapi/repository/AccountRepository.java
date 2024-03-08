package com.nhnacademy.springbootminidooray3accountapi.repository;

import com.nhnacademy.springbootminidooray3accountapi.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {

    Account save(Account account);

    Optional<Account> findById(String id);

    List<Account> findAll();

}