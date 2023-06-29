package com.example.config.autoconfig;

import com.example.config.ConditionalMyOnClass;
import com.example.config.EnableMyConfigrationProperties;
import com.example.config.MyAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 * TomcatWebServerConfig.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */
@MyAutoConfiguration
@ConditionalMyOnClass("org.apache.catalina.startup.Tomcat")
@EnableMyConfigrationProperties(ServerProperties.class)
public class TomcatWebServerConfig {

//    @Value("${contextPath:}")
//    String contextPath;
//
//    @Value("${port:8080}")
//    int port;

    @Bean("tomcatWebServerFactory")
    @ConditionalOnMissingBean
    public ServletWebServerFactory servletWebServerFactory(ServerProperties serverProperties) {
        TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
        serverFactory.setContextPath(serverProperties.getContextPath());
        serverFactory.setPort(serverProperties.getPort());
        return serverFactory;
    }

}
