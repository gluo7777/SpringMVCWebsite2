package com.example.demo.repository;

import com.example.demo.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by william.luo on 9/18/2017.
 */

@Repository
public interface AccountRepository extends CrudRepository<Account,Long>{

    Account findAccountByUserName(String username);

    Account findAccountByEmail(String email);

//    private Map<String,Account> accounts;
//
//    public AccountRepository() {
//        this.accounts = new HashMap<>();
//    }
//
//    public void add(Account account) {
//        if(!this.accounts.containsKey(account.getUserName())){
//            this.accounts.put(account.getUserName(),account);
//        }
//    }
//
//    public void remove(String username) {
//        this.accounts.remove(username);
//    }
//
//    public List<Account> getAccounts(){
//        List<Account> accountsList = new ArrayList<>(this.accounts.size());
//        accountsList.addAll(this.accounts.values());
//        return accountsList;
//    }
//
//    public Account findByEmail(String email) {
//        for(Account account : getAccounts()){
//            if(account.getEmail().equals(email)){
//                return account;
//            }
//        }
//        return null;
//    }
//
//    public Account findByUser(String user) {
//        return this.accounts.get(user);
//    }
}
