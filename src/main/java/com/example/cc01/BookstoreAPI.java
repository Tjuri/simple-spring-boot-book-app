package com.example.cc01;


import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
public class BookstoreAPI extends ResourceConfig {

    public BookstoreAPI() {
        super();

        register(JacksonFeature.class);
        register(BookResource.class);

        register(WadlResource.class);
        register(CORSFilter.class);

        register(ApiListingResource.class);
        register(SwaggerSerializers.class);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.1");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setPrettyPrint(true);
        beanConfig.setBasePath("/api/");
        beanConfig.setResourcePackage("com.example.cc01");
        beanConfig.setScan(true);
    }

}