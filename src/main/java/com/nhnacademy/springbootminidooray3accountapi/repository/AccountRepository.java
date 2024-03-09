package com.nhnacademy.springbootminidooray3accountapi.repository;

import com.nhnacademy.springbootminidooray3accountapi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}
