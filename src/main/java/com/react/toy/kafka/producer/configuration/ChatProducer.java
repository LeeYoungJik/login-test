package com.react.toy.kafka.producer.configuration;

import jakarta.annotation.PostConstruct;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class ChatProducer {
    private final String TOPIC_NAME = "chat-topic";

    @PostConstruct
    public void init(){
//        Properties props = new Properties();
////        props.setProperty("bootstrap.servers","192.168.1.163:9092");  이것도 된다. 아래것도 되고.
//        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
//        props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//
//        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(props);

    }


}
