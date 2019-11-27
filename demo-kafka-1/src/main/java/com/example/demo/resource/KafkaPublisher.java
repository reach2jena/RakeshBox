package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Student;

@RestController
@RequestMapping("/sendmsg")
public class KafkaPublisher {
	
	@Autowired
	KafkaTemplate<String, Student> kafkatemplate;

	@RequestMapping(value = "/push", method= RequestMethod.POST)
	public String pushMessageToKafka(@RequestBody Student std) {

		kafkatemplate.send("MySaanvitopic",std);
		return "Message Published";
	}
}
