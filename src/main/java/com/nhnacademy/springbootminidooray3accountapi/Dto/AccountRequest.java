package com.nhnacademy.springbootminidooray3accountapi.Dto;


import com.nhnacademy.springbootminidooray3accountapi.entity.Account;
import lombok.Data;

@Data
public class AccountRequest {

    private String id;
    private String password;
    private String email;
    private String state;

    public Account toEntity(){
        return Account.builder()
                .id(id)
                .password(password)
                .email(email)
                .state(state)
                .build();
    }

}
