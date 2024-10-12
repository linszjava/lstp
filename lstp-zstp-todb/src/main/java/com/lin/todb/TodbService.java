package com.lin.todb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 06:32
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.lin.todb.*.mapper")
public class TodbService {
    public static void main(String[] args) {
        SpringApplication.run(TodbService.class, args);
        System.out.println("todb服务启动成功==============>");
    }
}
