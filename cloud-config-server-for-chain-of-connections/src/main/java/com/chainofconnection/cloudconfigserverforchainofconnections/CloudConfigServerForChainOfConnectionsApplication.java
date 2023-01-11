package com.chainofconnection.cloudconfigserverforchainofconnections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerForChainOfConnectionsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerForChainOfConnectionsApplication.class, args);
	}
}
