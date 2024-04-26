
package com.KafkaPractice.Monolith.producer;

import com.KafkaPractice.Monolith.AppConstant.AppConstants;
import com.KafkaPractice.Monolith.payload.Employees;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);



    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendJsonData(Employees employees) {

        LOGGER.info(String.format("Message sent -> %s", employees.toString()));


        Message<Employees> message = MessageBuilder
                .withPayload(employees)
                .setHeader(KafkaHeaders.TOPIC, AppConstants.TopicName)
                .build();

        kafkaTemplate.send(message);
    }

}

