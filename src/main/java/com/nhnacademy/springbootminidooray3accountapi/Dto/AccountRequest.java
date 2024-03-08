package com.nhnacademy.springbootminidooray3accountapi.Dto;


import com.nhnacademy.springbootminidooray3accountapi.entity.Account;

public class AccountRequest {

    private String id;
    private String password;
    private String email;
    private String state;

    public Account toEntity(){
        return Account.builder()
                .password(password)
                .email(email)
                .state(state)
                .build();
    }

}
