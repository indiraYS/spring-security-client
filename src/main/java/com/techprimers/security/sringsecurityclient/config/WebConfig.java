package com.techprimers.security.sringsecurityclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

    //@Autowired
    //RequestContextListener requestContextListener;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers (final ViewControllerRegistry registry) {
        //super.addViewControllers(registry);

        registry.addViewController("/")
        .setViewName("forward:/index");

        registry.addViewController("/index");
        registry.addViewController("/securedPage");
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
    //test git
    //test 2
}
