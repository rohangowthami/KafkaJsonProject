/*
package com.KafkaPractice.Monolith.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;


@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    //to send the data you use kafkatemplate,
    // u created an object so that u can use methods in kafkaTemplate
    // you can send objects too use object name to do that
    private final KafkaTemplate<String , String>  kafkaTemplate;

    public void sendData(String data){

        log.info(format("sending data to MorrisonsEmployees :: %s ",data));
        kafkaTemplate.send("MorrisonsEmployees",data);

    }





}
*/
