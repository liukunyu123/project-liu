package com.practise.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableSwagger2
@EnableConfigurationProperties
@SpringBootApplication
public class FinanceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceBackendApplication.class, args);
    }

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }
}
