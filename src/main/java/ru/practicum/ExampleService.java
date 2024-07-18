package ru.practicum;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExampleService {
    //private final static Logger log = LoggerFactory.getLogger(ExampleService.class);

    public int sum(int a, int b) {
        log.info("Got a= {} and b= {}", a, b);
        return a + b;
    }
}
