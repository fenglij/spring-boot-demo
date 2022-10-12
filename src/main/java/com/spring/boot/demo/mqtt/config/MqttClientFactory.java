package com.spring.boot.demo.mqtt.config;

/*import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;*/
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * 客户端工厂
 */
//@Component
public class MqttClientFactory {

    /*public MqttClient createMqttClient() throws MqttException {
        Random random = new Random();
        int r = random.nextInt(10);
        MqttClientPersistence persistence = this.clientPersistence();
        MqttClient mqttClient = new MqttClient(MqttConfig.BROKER_URI, MqttConfig.CLIENT_ID + r, persistence);
        return mqttClient;
    }

    private MqttConnectOptions connectOptions() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(MqttConfig.CLIENT_DEFAULT_USERNAME);
        options.setPassword(MqttConfig.CLIENT_DEFAULT_PASSWORD.toCharArray());
        options.setCleanSession(true);
        options.setAutomaticReconnect(true);
        options.setConnectionTimeout(MqttConfig.CLIENT_CONNECTION_TIME_OUT);
        options.setKeepAliveInterval(MqttConfig.CLIENT_KEEP_ALIVE_INTERVAL);
        return options;
    }

    private MqttClientPersistence clientPersistence() {
        return new MemoryPersistence();
    }

    public void connect(MqttClient mqttClient) throws MqttException {
        mqttClient.connect(this.connectOptions());
    }*/
}
