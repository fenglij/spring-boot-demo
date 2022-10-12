package com.spring.boot.demo.mqtt.starter;

import com.spring.boot.demo.starter.mqtt.listener.AbstractMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MqttMessageListener extends AbstractMqttMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(MqttMessageListener.class);

    @Override
    public boolean receiveMessage(String topic, MqttMessage message) {
        logger.info("接收到消息2，主题:{}，消息: {}", topic, message);
        return false;
    }
}
