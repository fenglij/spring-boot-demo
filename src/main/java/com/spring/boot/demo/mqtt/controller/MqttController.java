package com.spring.boot.demo.mqtt.controller;

import com.spring.boot.demo.mqtt.producer.MqttProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttController {

    @Autowired
    private MqttProducer producer;

    @RequestMapping("/send")
    public String send(@RequestParam("message") String message) {
        producer.send(message);
        return message;
    }
}
