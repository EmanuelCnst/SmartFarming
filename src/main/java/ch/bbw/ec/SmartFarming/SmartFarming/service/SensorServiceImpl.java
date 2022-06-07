package ch.bbw.ec.SmartFarming.SmartFarming.service;

import ch.bbw.ec.SmartFarming.SmartFarming.interfaces.SensorService;
import ch.bbw.ec.SmartFarming.SmartFarming.model.Sensor;
import org.springframework.stereotype.Service;

@Service
public class SensorServiceImpl implements SensorService {

    @Override
    public void addSensor(Sensor sensor) {

        System.out.println("Sensor data");
        System.out.println("C02");
        System.out.println(sensor.getCo2());
        System.out.println("Moil Sensor");
        System.out.println(sensor.getMoilSensor());
        System.out.println("Humidity");
        System.out.println(sensor.getHumidity());
        System.out.println("Temperatur");
        System.out.println(sensor.getTemperature());


    }
}
