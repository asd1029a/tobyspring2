package com.example.config.autoconfig;

import com.example.config.MyConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ServerProperties.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.29
 */
@MyConfigurationProperties(prefix = "server")
public class ServerProperties {

    private String contextPath;

    private int port;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
