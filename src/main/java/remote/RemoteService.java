package remote;

public class RemoteService {
    LEDController controller = new LEDController();
    public boolean processControl(int control, String password){
        if(Authenticator.authenticate(password)){
            controller.tunOn();
            return true;
        }
        else{
            return false;
            //return error with wrong password!
        }
    }

}
