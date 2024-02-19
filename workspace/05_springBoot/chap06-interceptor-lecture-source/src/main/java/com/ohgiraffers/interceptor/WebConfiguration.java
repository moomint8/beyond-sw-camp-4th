package com.ohgiraffers.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* 설명. Interceptor 추가 및 static(정적) 리소스 호출 경로 등록 설정 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    private StopwatchInterceptor stopwatchInterceptor;

    @Autowired
    public WebConfiguration(StopwatchInterceptor stopwatchInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
    }

    /* 설명. Interceptor를 따로 여기서 등록해줘야 실제로 동작하는 Interceptor가 된다. */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(stopwatchInterceptor)
                .excludePathPatterns("/css/**");        // excludePathPatterns을 등록해준 경로의 요청은 인터셉터가 가로채지 않음
    }
}
