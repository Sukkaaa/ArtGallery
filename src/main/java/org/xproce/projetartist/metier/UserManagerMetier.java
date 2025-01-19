package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.User;
import org.xproce.projetartist.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerMetier implements UserManager {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
       return user;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
