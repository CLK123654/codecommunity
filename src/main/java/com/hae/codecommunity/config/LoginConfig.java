package com.hae.codecommunity.config;

import com.hae.codecommunity.component.LoginHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfig implements WebMvcConfigurer {

  @Autowired
  private LoginHandlerInterceptor loginHandlerInterceptor;

  /**
   * 配置要拦截的路径
   * @param registry
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(loginHandlerInterceptor)
            .addPathPatterns("/**")
            .excludePathPatterns("/", "/user/login")
            .excludePathPatterns("/user/loginPage");
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
  }
}
