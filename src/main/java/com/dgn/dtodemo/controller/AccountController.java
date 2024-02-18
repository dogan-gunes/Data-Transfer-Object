package com.dgn.dtodemo.controller;

import com.dgn.dtodemo.dto.AccountAddRequest;
import com.dgn.dtodemo.dto.AccountResponse;
import com.dgn.dtodemo.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("/addAccount")
    public ResponseEntity<AccountResponse> addAccount(@RequestBody AccountAddRequest accountAddRequest){
        return new ResponseEntity<>(accountService.addAccount(accountAddRequest), HttpStatus.CREATED);
    }
    @GetMapping("/getAccountById/{id}")
    public ResponseEntity<AccountResponse> getAccountById(@PathVariable Long id){
        return new ResponseEntity<>(accountService.getAccountById(id),HttpStatus.OK);
    }
    @GetMapping("/getAllAccount")
    public ResponseEntity<List<AccountResponse>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(),HttpStatus.OK);
    }

}
