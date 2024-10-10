package com.lin.zstp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 02:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZstpService {
    public static void main(String[] args) {
        SpringApplication.run(ZstpService.class, args);
        System.out.println("ZstpService 成功启动 ===================>");
    }
}
