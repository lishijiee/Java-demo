package com.lishijiee.kafka;

public interface Producer {
    void send(Order order);

    void close();
}
