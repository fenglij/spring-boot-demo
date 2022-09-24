package com.spring.boot.demo.mqtt.consumer;

import com.spring.boot.demo.mqtt.config.MqttClientFactory;
import com.spring.boot.demo.mqtt.config.MqttConfig;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqttConsumer {

    @Autowired
    private MqttClientFactory factory;

    public void subscribe() throws MqttException {
        MqttClient mqttClient = factory.createMqttClient();
        mqttClient.subscribe(MqttConfig.PRODUCER_DEFAULT_TOPIC, new MqttMessageListener());
    }
}
