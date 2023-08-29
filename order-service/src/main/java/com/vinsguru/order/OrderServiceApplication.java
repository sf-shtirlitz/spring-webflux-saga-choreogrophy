package com.vinsguru.order;

import com.vinsguru.order.application.service.InventoryComponentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);
        //context.getBean(beanName);
        //context.getBean(InventoryComponentService.class);
        //examples of use above
    }

}
