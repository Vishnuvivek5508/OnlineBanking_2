package com.vishnuvivek.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.vishnuvivek.onlinebanking.security.Role;

/**
  * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}