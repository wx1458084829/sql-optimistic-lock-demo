package com.namo.sqloptimisticlockdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author namo
 */
@SpringBootApplication
@MapperScan("com.namo.sqloptimisticlockdemo.mapper")
public class SqlOptimisticLockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlOptimisticLockDemoApplication.class, args);
    }

}
