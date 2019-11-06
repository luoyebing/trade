package com.luo.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude= {DataSourceAutoConfiguration.class})
@Configuration
@MapperScan("com.luo.trade.repository.mapper")
@SpringBootApplication
public class TradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeApplication.class, args);
	}

}
