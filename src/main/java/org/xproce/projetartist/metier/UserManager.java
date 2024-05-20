package metier;

public interface UserManager {
    public String hashPassword(String password);
    public boolean verifyPassword(String rawPassword, String hashedPassword);
}
