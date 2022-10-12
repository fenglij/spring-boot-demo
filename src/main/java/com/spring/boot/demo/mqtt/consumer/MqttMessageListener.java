package com.spring.boot.demo.mqtt.consumer;

/*import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttMessageListener /*implements IMqttMessageListener*/ {
    private static final Logger logger = LoggerFactory.getLogger(MqttMessageListener.class);
    /*@Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        logger.info("收到来自主题: {}，消息: {}", topic, mqttMessage);
    }*/
}
