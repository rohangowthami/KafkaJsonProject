package com.KafkaPractice.Monolith.consumer;

import com.KafkaPractice.Monolith.AppConstant.AppConstants;
import com.KafkaPractice.Monolith.payload.Employees;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

  /*  @KafkaListener(topics = "MorrisonsEmployees ",groupId = " user-group")
    public void  consumeMsg(String data){
        log.info(format("Receving  Morrisons User data from the sender :: %s ",data));
    }
*/
    @KafkaListener(topics = AppConstants.TopicName,groupId = AppConstants.Group)
    public void  consumeJsonMsg(Employees employees){
        log.info(format("Receving  Morrisons User data from the sender :: %s ",employees.toString()));
    }
}
