package com.yuzh.springbootweb.service;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements Runnable{
    public void hellloService() {
        System.out.println("dddddd");
    }

    @Override
    public void run() {
        System.out.println("thead....");
    }
}
