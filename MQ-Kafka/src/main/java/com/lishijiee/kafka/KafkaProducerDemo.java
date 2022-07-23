package com.lishijiee.kafka;

public class KafkaProducerDemo {

    public static void main(String[] args) {
        testProducer();
    }

    private static void testProducer() {
        ProducerImpl producer = new ProducerImpl();
        for (int i = 0; i < 1000; i++) {
            producer.send(new Order(1000L + i,System.currentTimeMillis(),"zhangsan", 6.5d));
            producer.send(new Order(2000L + i,System.currentTimeMillis(),"lisi", 6.51d));
        }
    }
}
