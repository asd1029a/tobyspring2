package com.example.config.autoconfig;

import com.example.config.MyAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * TomcatWebServerConfig.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */
@MyAutoConfiguration
@Conditional({JettyWebServerConfig.JettyCondition.class})
public class JettyWebServerConfig {

    @Bean("jettyWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory() {

        return new JettyServletWebServerFactory();
    }

    static class JettyCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return false;
        }
    }
}
