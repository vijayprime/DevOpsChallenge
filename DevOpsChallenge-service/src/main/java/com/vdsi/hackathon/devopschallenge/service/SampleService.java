package com.vdsi.hackathon.devopschallenge.service;

import org.springframework.stereotype.Service;

import com.vdsi.hackathon.devopschallenge.model.SampleResponse;

@Service
public class SampleService {
    public SampleResponse sayHello(String message) {
        return new SampleResponse("hello vicky" + message, "SUCCESS");
    }
}
