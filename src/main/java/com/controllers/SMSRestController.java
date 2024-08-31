package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SMSSendRequest;
import com.service.SMSService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class SMSRestController {

    @Autowired
    SMSService smsService;

    @PostMapping("/processSMS")
    public String processSMS(@RequestBody SMSSendRequest sendRequest){
        log.info("processSMS Started sendRequest: "+sendRequest.toString());
        return smsService.sendSMS(sendRequest.getDestinationSMSNumber(), sendRequest.getSmsMessage());
    }
}
