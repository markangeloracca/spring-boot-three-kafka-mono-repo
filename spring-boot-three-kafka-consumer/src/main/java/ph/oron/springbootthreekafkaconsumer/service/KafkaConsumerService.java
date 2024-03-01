package ph.oron.springbootthreekafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {


    private final String groupId = "${spring.kafka.group-id}";
    @KafkaListener(topics = "${spring.kafka.listening-topic}",
            groupId = "${spring.kafka.group-id}")
    public void listenGroupMessage(String message) {
        System.out.println("Received Message in group " + groupId + "| message: " + message);
    }
}
