package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@EnableKafka
@RestController
public class KafkaConsumerService {

	String result =null;
	/*
	 * @Autowired ConcurrentKafkaListenerContainerFactory<String, String>
	 * kafkaconsumerFactory;
	 */
List<String> messages = new ArrayList<String>();

@RequestMapping(value="/getdata", method= {RequestMethod.GET})
public List<String>  readMessage()
{
	
System.out.println("Hi"+result);	
return messages;
	
}

@KafkaListener(topics = "MySaanvitopic", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory" )
public String getData(String data){
	
	messages.add(data);
	System.out.println("DataList -- "+ messages);
	result=data;
	return data;
	}
}
