package com.yuan.newbeecopy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com/yuan/newbeecopy/mapper")
public class NewBeeCopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewBeeCopyApplication.class, args);
    }

}
