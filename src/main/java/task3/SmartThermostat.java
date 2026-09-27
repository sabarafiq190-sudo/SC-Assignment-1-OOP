package task3;

public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private double temperature = 22.0;

    @Override
    public void turnOn() { isOn = true; }

    @Override
    public void turnOff() { isOn = false; }

    @Override
    public String getStatus() {
        return "Thermostat is " + (isOn ? "ON" : "OFF") + ", set to " + temperature + "C";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}