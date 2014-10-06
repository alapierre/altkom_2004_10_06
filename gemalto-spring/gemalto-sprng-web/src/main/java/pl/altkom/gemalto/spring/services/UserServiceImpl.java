/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.altkom.gemalto.spring.dao.UserRepository;
import pl.altkom.gemalto.spring.model.User;

/**
 *
 * @author lkozlows
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

@Override
public void create (User user){
    userRepository.save(user);
}

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
}
