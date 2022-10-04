package com.vishnuvivek.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.vishnuvivek.onlinebanking.entity.SavingsTransaction;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *  * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}