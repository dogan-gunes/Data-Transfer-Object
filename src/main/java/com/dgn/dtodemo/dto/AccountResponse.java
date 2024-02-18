package com.dgn.dtodemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AccountResponse {
    private String name;
    private String surname;
}
