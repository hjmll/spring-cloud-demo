package cn.itcast.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @Author: hjm
 * @Date: 2024/11/09/10:09
 * @Description:
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level loggerLevel(){
        return Logger.Level.BASIC;
    }
}
