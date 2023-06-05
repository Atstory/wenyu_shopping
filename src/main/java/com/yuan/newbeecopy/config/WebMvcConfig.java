package com.yuan.newbeecopy.config;

import com.yuan.newbeecopy.config.handler.TokenToAdminUserArgumentResolver;
import com.yuan.newbeecopy.config.handler.TokenToMallUserArgumentResovler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Autowired
    TokenToAdminUserArgumentResolver tokenToAdminUserArgumentResolver;
    @Autowired
    TokenToMallUserArgumentResovler tokenToMallUserArgumentResovler;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html","/goods-img/**")
                .addResourceLocations("classpath:/META-INF/resources/","classpath:public/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(tokenToAdminUserArgumentResolver);
        argumentResolvers.add(tokenToMallUserArgumentResovler);
    }
}
