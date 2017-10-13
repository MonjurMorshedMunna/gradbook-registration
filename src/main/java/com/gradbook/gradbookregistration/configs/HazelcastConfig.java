package com.gradbook.gradbookregistration.configs;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {
    @Bean
    public HazelcastInstance getInstance(){
        return HazelcastClient.newHazelcastClient();
    }
}
