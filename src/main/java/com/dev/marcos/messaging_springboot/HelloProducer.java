package com.dev.marcos.messaging_springboot;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
/**
 * Esta é uma classe produtora do kafka, ou seja, ela irá produzir 
 * e enviar as mensagens para posteriormente ser ativado um evento e ser consumida
 */
public class HelloProducer {
    
    /**
     * O KafkaTemplate é o objeto que utilizando para enviar as mensagens para o MessageBroker  
     * Ela recebe 2 parâmetros, sendo o primeiro o nome do tópico, e o segundo o tipo da mensagem que será enviada
     * neste exemplo estou utilizando uma mensagem simples do tipo String
     **/
    private final KafkaTemplate<String, String> kafkaTemplate;

    public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        /**
         * Aqui definimos o nome do tópico que iremos utilizar, sendo ele "hello-topic"
         * e após definimos a mensagem que iremos utilizar, senda ela parametrizada....
         */
        kafkaTemplate.send("hello-topic", message);
    }

}
