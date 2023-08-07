package com.ssh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssh.mapper")
public class V1SshBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(V1SshBackendApplication.class, args);
    }

}
