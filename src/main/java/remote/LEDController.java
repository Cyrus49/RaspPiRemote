package remote;


import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class LEDController {
    public void tunOn(){
        try{
            GpioController gpio = GpioFactory.getInstance();
            final GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);

            /** Blink every second */
            ledPin.blink(1000, 15000);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
