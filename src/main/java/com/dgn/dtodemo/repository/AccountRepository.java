package com.dgn.dtodemo.repository;

import com.dgn.dtodemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
