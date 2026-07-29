package com.forgeos.forge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Welcome to ForgeOS 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "ForgeOS Backend is running!";
    }
}