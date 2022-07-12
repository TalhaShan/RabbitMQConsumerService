package com.rabbitmqlistenermicorservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }
}

//if somehow listener server is down rabbitmq will store your message and publish as soon as it got up. no data will be lost