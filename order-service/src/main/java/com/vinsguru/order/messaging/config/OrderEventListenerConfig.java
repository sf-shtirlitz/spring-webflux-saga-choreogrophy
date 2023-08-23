package com.vinsguru.order.messaging.config;

import com.vinsguru.common.events.order.OrderEvent;
import com.vinsguru.order.common.service.OrderEventEmitter;
import com.vinsguru.order.messaging.publisher.OrderEventListenerPublisherImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Configuration
public class OrderEventListenerConfig {

    @Bean
    public OrderEventEmitter orderEventEmitter(){
        Sinks.Many<OrderEvent> sink = Sinks.many().unicast().<OrderEvent>onBackpressureBuffer();
        Flux<OrderEvent> flux = sink.asFlux();
        return new OrderEventListenerPublisherImpl(sink, flux);
    }

}
