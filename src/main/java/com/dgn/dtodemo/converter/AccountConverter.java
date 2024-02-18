package com.dgn.dtodemo.converter;

import com.dgn.dtodemo.dto.AccountAddRequest;
import com.dgn.dtodemo.dto.AccountResponse;
import com.dgn.dtodemo.model.Account;

import java.util.List;

public class AccountConverter {

    public static Account fromAccountAddRequestToAccount(AccountAddRequest accountAddRequest) {
        return Account.builder()
                .name(accountAddRequest.getName())
                .surname(accountAddRequest.getSurname())
                .build();
    }

    public static AccountResponse fromAccountToAccountResponse(Account account) {
        return AccountResponse.builder()
                .name(account.getName())
                .surname(account.getSurname())
                .build();
    }

    public static List<AccountResponse> fromAccountsToAccountsResponse(List<Account> accounts){
        return accounts.stream()
                .map(AccountConverter::fromAccountToAccountResponse)
                .toList();
    }

}
