package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @auther zzyy
 * @create 2019-11-12 14:31
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001
{
    public static void main(String[] args)
    {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
 