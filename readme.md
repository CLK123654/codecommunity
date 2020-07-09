* 配置拦截器
    1.实现HandlerInterceptor接口
    2.定义一个@configuration注解类，实现WebMvcConfigurer接口，重写addInterceptors方法配置要拦截的路径。
* 加载不了css样式的问题:
```java
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
    registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
  }
}
```
addResourceHandlers并不是在springboot默认的访问的资源文件上添加而是会以该方法中添加的路径去替换默认路径。
所以之前默认在classpath:static/路径下能直接访问的，配置了addResourceHandlers就会被覆盖。