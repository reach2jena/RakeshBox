package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.resource.KafkaConsumerService;

@RestController
public class TestController {

@RequestMapping(value = "/check", method = {RequestMethod.GET} )
public String getMessage()

{

new KafkaConsumerService().readMessage();
return new String("Successfully hit the api--");
}
}
