package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.User;

import java.util.List;

public interface UserManager {
   // public String hashPassword(String password);
   // public boolean verifyPassword(String rawPassword, String hashedPassword);
    public List<User> getAllUsers();
    public User saveUser(User user);
    public User findUserById(Long id);
}
