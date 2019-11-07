package com.luo.trade.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "mail")
@Data
public class MailProperties {
    private String host;
    private Integer port;

}
