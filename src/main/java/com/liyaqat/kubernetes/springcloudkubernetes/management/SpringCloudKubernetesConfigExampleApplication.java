package com.liyaqat.kubernetes.springcloudkubernetes.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCloudKubernetesConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKubernetesConfigExampleApplication.class, args);
	}

}
