package com.spring.boot.demo.mqtt.producer;

import com.spring.boot.demo.mqtt.config.MqttClientFactory;
import com.spring.boot.demo.mqtt.config.MqttConfig;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqttProducer {

    @Autowired
    private MqttClientFactory factory;

    public void send(String payload) {
        this.send(MqttConfig.PRODUCER_DEFAULT_TOPIC, payload);
    }

    public void send(String topic, String payload) {
        this.send(topic, MqttConfig.PRODUCER_DEFAULT_QOS, payload);
    }

    public void send(String topic, int qos, String payload) {
        this.send(topic, qos, MqttConfig.PRODUCER_DEFAULT_RETAINED, payload);
    }

    public void send(String topic, int qos, boolean retained, String payload) {
        try {
            MqttClient mqttClient = factory.createMqttClient();
            factory.connect(mqttClient);
            mqttClient.publish(topic, payload.getBytes(), qos, retained);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
