package com.mmert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mmert.service.KafkaProducerService;

@RestController
@RequestMapping(value = "/api/")
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @GetMapping(value = "/producer")
    public String sendMessage(@RequestParam("message") String message)
    {
        kafkaProducer.send(message);
        return "Message Send Successfully";
    }

}