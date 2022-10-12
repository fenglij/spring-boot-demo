package com.spring.boot.demo.mqtt.starter;

import com.spring.boot.demo.starter.mqtt.service.ProducerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 使用starter的方式加载MQTT客户端
 */
@RestController
public class MqttStarterController {

    @Resource(name = "producerService")
    private ProducerService producerService;

    @RequestMapping("/send2")
    public String send(@RequestParam("message") String message) {
        producerService.send(message);
        return message;
    }
}
