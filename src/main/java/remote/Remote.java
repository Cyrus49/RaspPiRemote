package remote;

public class Remote {
    LEDController controller = new LEDController();
    public void processControl(int control){
        controller.tunOn();
    }
}
