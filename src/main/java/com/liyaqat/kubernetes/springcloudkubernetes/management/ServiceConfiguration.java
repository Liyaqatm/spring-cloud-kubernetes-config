package com.liyaqat.kubernetes.springcloudkubernetes.management;

import com.liyaqat.kubernetes.springcloudkubernetes.management.helpers.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@PropertySource(value = "file:${CONFIG_DIR}/application-config.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "inventory")
public class ServiceConfiguration {

    private String greet;

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

}
