package com.ssh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Cinzia
 * @Description Web项目配置类
 * @Date 2023/8/8 4:37
 * @Version 1.0
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("image/swiper/**").addResourceLocations("file:E:\\ssh_images\\swiper\\");
    }
}
