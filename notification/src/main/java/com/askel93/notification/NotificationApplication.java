package com.askel93.notification;

import com.askel93.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.askel93.notification",
                "com.askel93.amqp"
        }
)
@EnableEurekaClient
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    //кусок чтобы слать в rabbit свое сообщение при старте
    /*@Bean
    CommandLineRunner commandLineRunner(
            RabbitMQMessageProducer producer, NotificationConfig notificationConfig){
        return args -> {
            producer.publish(new Person("Ali", 18),
                    notificationConfig.getInternalExchange(),
                    notificationConfig.getInternalNotificationRoutingKey());
        };
    }

    record Person(String name, int age){}
*/
}
