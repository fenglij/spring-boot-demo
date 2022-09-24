package com.spring.boot.demo.mqtt.config;

public class MqttConfig {
    public static final String CLIENT_DEFAULT_USERNAME = "admin";
    public static final String CLIENT_DEFAULT_PASSWORD = "sha256";
    public static final String CLIENT_ID = "paho_1";
    public static final Integer CLIENT_KEEP_ALIVE_INTERVAL = 120;
    public static final Integer CLIENT_CONNECTION_TIME_OUT = 30;
    public static final String BROKER_URI = "tcp://39.108.150.34:1883";

    public static final Integer PRODUCER_DEFAULT_QOS = 1;
    public static final Boolean PRODUCER_DEFAULT_RETAINED = true;
    public static final String PRODUCER_DEFAULT_TOPIC = "topic/test1";

    public static final String[] CONSUMER_TOPICS = new String[]{"topic/test2", "topic/test3"};
}
