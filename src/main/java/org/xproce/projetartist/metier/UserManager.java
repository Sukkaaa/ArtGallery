package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.User;

import java.util.List;

public interface UserManager {

    public List<User> getAllUsers();
    public User saveUser(User user);
    public User findUserById(Long id);
}
