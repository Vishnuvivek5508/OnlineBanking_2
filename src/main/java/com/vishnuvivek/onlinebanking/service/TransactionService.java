package com.vishnuvivek.onlinebanking.service;

import java.security.Principal;
import java.util.List;

import com.vishnuvivek.onlinebanking.entity.PrimaryAccount;
import com.vishnuvivek.onlinebanking.entity.PrimaryTransaction;
import com.vishnuvivek.onlinebanking.entity.Recipient;
import com.vishnuvivek.onlinebanking.entity.SavingsAccount;
import com.vishnuvivek.onlinebanking.entity.SavingsTransaction;

/** * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;

    List<Recipient> findRecipientList(Principal principal);

    Recipient saveRecipient(Recipient recipient);

    Recipient findRecipientByName(String recipientName);

    void deleteRecipientByName(String recipientName);

    void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);
}