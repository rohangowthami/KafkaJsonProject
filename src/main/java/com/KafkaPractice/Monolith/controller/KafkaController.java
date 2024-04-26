package com.KafkaPractice.Monolith.controller;

import com.KafkaPractice.Monolith.payload.Employees;
import com.KafkaPractice.Monolith.producer.KafkaJsonProducer;
//import com.KafkaPractice.Monolith.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/SendMorrisonsData")
@RequiredArgsConstructor
public class KafkaController {

   // private final KafkaProducer  kafkaProducer;

    private final KafkaJsonProducer kafkaJsonProducer;
   /* @PostMapping
    public ResponseEntity<String> sendData(@RequestBody String data){
        kafkaProducer.sendData(data);
        return ResponseEntity.ok("Data sent Successfully to morrisons ");
    }*/

   @PostMapping("/json")
    public ResponseEntity<String> sendJsonData(@RequestBody Employees message){
        kafkaJsonProducer.sendJsonData(message);
        return ResponseEntity.ok("Data sent Successfully to morrisons in a Json Format ");
    }


}
