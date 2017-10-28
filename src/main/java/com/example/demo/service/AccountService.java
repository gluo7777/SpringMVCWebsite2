package com.example.demo.service;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.handler.exceptions.UserExistsException;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by william.luo on 9/18/2017.
 */
@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Transactional
    public Account registerNewAccount(AccountDto dto) throws UserExistsException {
        if (userExists(dto)) {
            throw new UserExistsException("Already exists an account with username or email: " + dto.getUsername() + " " + dto.getEmail());
        }
        Account account = new Account(dto.getUsername(), dto.getPassword(), dto.getEmail());
        accountRepository.save(account);
        return account;
    }

    private boolean userExists(AccountDto dto) {
        if (getAccountByUser(dto.getUsername()) != null
                || getAccountByEmail(dto.getEmail()) != null)
            return true;
        return false;
    }

    public Account getAccountByUser(String user) {
        return accountRepository.findAccountByUserName(user);
    }

    public Account getAccountByEmail(String email) {
        return accountRepository.findAccountByEmail(email);
    }
}
