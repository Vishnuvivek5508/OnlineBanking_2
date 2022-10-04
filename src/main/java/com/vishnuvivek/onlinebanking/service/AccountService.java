package com.vishnuvivek.onlinebanking.service;

import java.security.Principal;

import com.vishnuvivek.onlinebanking.entity.PrimaryAccount;
import com.vishnuvivek.onlinebanking.entity.SavingsAccount;

/**
 * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}