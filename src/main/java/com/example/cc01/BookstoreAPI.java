package com.example.cc01;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Configuration
@Component
@ApplicationPath("/api")
public class BookstoreAPI extends ResourceConfig {

    public BookstoreAPI() {
        super();

        register(JacksonFeature.class);
        register(BookResource.class);
    }
}