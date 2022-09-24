package com.spring.boot.demo.mqtt.consumer;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 容器启动即订阅
 */
@Component
public class MqttConsumerInit implements InitializingBean {

    @Autowired
    private MqttConsumer mqttConsumer;

    @Override
    public void afterPropertiesSet() throws Exception {
        mqttConsumer.subscribe();
    }
}
