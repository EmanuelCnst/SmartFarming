package ch.bbw.ec.SmartFarming.SmartFarming.model;

public class Sensor {

    private double temperature;
    private double humidity;
    private double co2;
    private int moilSensor;

    public Sensor(double temperature, double humidity, double co2, int moilSensor) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.co2 = co2;
        this.moilSensor = moilSensor;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public int getMoilSensor() {
        return moilSensor;
    }

    public void setMoilSensor(int moilSensor) {
        this.moilSensor = moilSensor;
    }
}
