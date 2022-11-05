package com.example.springboot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car car(
            @Value("${car.make: 'BMW'}") String make,
            @Value("${car.model: 'M3'}") String model

    ) {
        return new Car(make, model);
    }
}
