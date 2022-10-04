package com.vishnuvivek.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.vishnuvivek.onlinebanking.entity.PrimaryAccount;

/**
 * * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22 template use File | Settings | File Templates.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}