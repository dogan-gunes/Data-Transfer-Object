package com.dgn.dtodemo.service;

import com.dgn.dtodemo.converter.AccountConverter;
import com.dgn.dtodemo.dto.AccountAddRequest;
import com.dgn.dtodemo.dto.AccountResponse;
import com.dgn.dtodemo.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountResponse addAccount(AccountAddRequest accountAddRequest) {
        return AccountConverter.fromAccountToAccountResponse(
                accountRepository.save(AccountConverter.fromAccountAddRequestToAccount(accountAddRequest))
        );
    }

    public AccountResponse getAccountById(Long id){
        return AccountConverter.fromAccountToAccountResponse(accountRepository.findById(id).orElse(null));
    }

    public List<AccountResponse> getAllAccount(){
        return AccountConverter.fromAccountsToAccountsResponse(accountRepository.findAll());
    }
}
