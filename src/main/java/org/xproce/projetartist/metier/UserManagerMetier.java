package metier;

import dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserManagerMetier implements UserManager {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String hashPassword(String password) {
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    @Override
    public boolean verifyPassword(String rawPassword, String hashedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(rawPassword, hashedPassword);    }
}
