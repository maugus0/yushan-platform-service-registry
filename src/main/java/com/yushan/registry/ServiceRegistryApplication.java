package com.yushan.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Service Registry Application
 *
 * This is the central service discovery server for the Yushan platform.
 * All microservices (User, Content, Engagement, Gamification, Analytics)
 * register themselves with this server and discover each other through it.
 *
 * @author Yushan Platform Team
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer  // This single annotation enables Eureka Server functionality
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);

        // Print startup message
        System.out.println("===========================================");
        System.out.println("✅ Eureka Service Registry is running!");
        System.out.println("📊 Dashboard: http://localhost:8761");
        System.out.println("💚 Health Check: http://localhost:8761/actuator/health");
        System.out.println("===========================================");
    }
}