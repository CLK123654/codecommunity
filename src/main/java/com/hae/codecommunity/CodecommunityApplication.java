package com.hae.codecommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CodecommunityApplication {

  public static void main(String[] args) {
    SpringApplication.run(CodecommunityApplication.class, args);
  }

}
