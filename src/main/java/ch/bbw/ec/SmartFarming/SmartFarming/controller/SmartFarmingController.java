package ch.bbw.ec.SmartFarming.SmartFarming.controller;

import ch.bbw.ec.SmartFarming.SmartFarming.model.Sensor;
import ch.bbw.ec.SmartFarming.SmartFarming.service.SensorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class SmartFarmingController {

    @Autowired
    SensorServiceImpl sensorServiceimpl;

    @PostMapping ("/uploadSensorData")
    public void addSensorData(@RequestBody Sensor sensor){
         sensorServiceimpl.addSensor(sensor);

    }

    @GetMapping("/hello")
    public String test(Model model) {

        return "hello";
    }
}

