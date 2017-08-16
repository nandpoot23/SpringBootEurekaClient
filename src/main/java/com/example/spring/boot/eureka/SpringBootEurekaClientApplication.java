package com.example.spring.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * We can use @EnableDiscoveryClient annotation as an alternative of @EnableEurekaClient
 * annotation. This is available inside the
 * org.springframework.cloud.client.discovery package of the
 * spring-cloud-commons-1.2.3.RELEASE.jar
 * 
 * @author mlahariya
 * @version 1.0, Aug 2017
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringBootEurekaClientApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(SpringBootEurekaClientApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter("eureka-micro-service.pid"));
        springApplication.run(args);

    }
}
