package com.vishnuvivek.onlinebanking.service;

import com.vishnuvivek.onlinebanking.entity.User;
import com.vishnuvivek.onlinebanking.security.UserRole;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
  * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
@Service("userDetailsService")
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save(User user);

    User createUser(User user, Set<UserRole> userRoles);

    User saveUser(User user);

    List<User> findUserList();

    void enableUser(String username);

    void disableUser(String username);

}