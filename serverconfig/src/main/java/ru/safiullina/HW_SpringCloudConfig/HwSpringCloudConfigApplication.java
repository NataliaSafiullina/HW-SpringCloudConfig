package ru.safiullina.HW_SpringCloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HwSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwSpringCloudConfigApplication.class, args);
	}

}
