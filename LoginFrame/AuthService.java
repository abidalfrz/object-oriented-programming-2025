public class AuthService {

    // create dummy user
    private User defaultUser= new User("abid", "bid123");

    public boolean login(String username, String password) {
        return defaultUser.getUsername().equals(username) && defaultUser.getPassword().equals(password);
    }   
}
