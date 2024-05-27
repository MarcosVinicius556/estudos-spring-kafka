package com.dev.marcos.messaging_springboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
/**
 * Classes consumers são aquelas que irão se inscrever em um tópico e consumir as mensagens
 * Neste exemplo, estamos consumindo o tópico do hello-topic criado na classe HelloProducer
 * Assim, quando um evento neste tópico for acionado, automaticamente o método receiveMessage será acionado
 * e fara o processamento da mensagem
 */
public class HelloConsumer {
    
    //@KafkaListener -> Define qual tópico este método irá "escutar"
    @KafkaListener(topics="hello-topic", groupId="group-1")
    public void receiveMessage(String message) {
        System.out.println("Consumer message -> " + message);
    }

}
