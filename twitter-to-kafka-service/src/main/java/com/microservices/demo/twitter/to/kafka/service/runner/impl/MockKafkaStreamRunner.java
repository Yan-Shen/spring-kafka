package com.microservices.demo.twitter.to.kafka.service.runner.impl;

import com.microservices.demo.twitter.to.kafka.service.runner.StreamRunner;
import twitter4j.TwitterException;

public class MockKafkaStreamRunner implements StreamRunner {
    @Override
    public void start() throws TwitterException {
    // adding commnets
        // commits 2 activity
    }
}
