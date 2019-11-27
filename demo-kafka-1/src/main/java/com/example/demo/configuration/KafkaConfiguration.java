package com.example.demo.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import model.Student;

@Configuration
public class KafkaConfiguration {


	@Bean	
	public ProducerFactory<String, Student> getProducerfactory()
	{
		
		Map<String, Object> datamap =new HashMap<String, Object>();
		datamap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		
		datamap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		datamap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<String, Student>(datamap);
	}
	
	@Bean
	public KafkaTemplate<String, Student> kafkatemplate()
	{
		
		return new KafkaTemplate<String, Student>(getProducerfactory());
	}
}
