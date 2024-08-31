package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsOtpApplication {

	public static void main(String[] args) {
		System.out.println("SMS_OTP starting...");
		SpringApplication.run(SmsOtpApplication.class, args);
		System.out.println("SMS_OTP started successfully");
	}

}
