package com.example.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by bocom_yjh on 2017/5/9 0009.
 */



@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
       this.packages("com.example.config.rest");
    }

}
