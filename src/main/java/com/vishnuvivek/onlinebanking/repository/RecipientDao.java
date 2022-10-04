package com.vishnuvivek.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.vishnuvivek.onlinebanking.entity.Recipient;

import java.util.List;

/**
 * * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}