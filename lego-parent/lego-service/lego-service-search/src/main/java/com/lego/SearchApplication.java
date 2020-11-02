package com.lego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.elasticsearch.core.SearchResultMapper;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.lego *
 * @since 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lego.goods.feign")
public class SearchApplication {


    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class,args);
    }

}
