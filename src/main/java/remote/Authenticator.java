package remote;

public class Authenticator {
    private static final String PASSWORD = "hellothere!";
    public static boolean authenticate(String attempt){
        if(PASSWORD.equals(attempt)) return true;
        return false;
    }
}
