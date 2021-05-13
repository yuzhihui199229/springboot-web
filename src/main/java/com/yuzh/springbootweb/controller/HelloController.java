package com.yuzh.springbootweb.controller;

import com.yuzh.springbootweb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public synchronized String hello() {
        try {
            new Thread(() -> {
                try {
                    synchronized (this) {
                        System.out.println("fffffffffff");
                        helloService.hellloService();
                        wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(helloService::run).start();
            System.out.println("this is a test");
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fdsf";
    }
}
