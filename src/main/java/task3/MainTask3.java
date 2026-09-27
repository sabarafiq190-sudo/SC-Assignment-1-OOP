package task3;

import java.util.ArrayList;
import java.util.List;

public class MainTask3 {
    public static void main(String[] args) {
        List<SmartDevice> devices = new ArrayList<>();
        SmartBulb bulb = new SmartBulb();
        SmartThermostat thermostat = new SmartThermostat();

        bulb.setBrightness(75);
        thermostat.setTemperature(19.5);

        devices.add(bulb);
        devices.add(thermostat);

        for (SmartDevice d : devices) {
            d.turnOn();
            System.out.println(d.getStatus());
        }
    }
}