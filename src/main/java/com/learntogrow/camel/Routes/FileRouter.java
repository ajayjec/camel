package com.learntogrow.camel.Routes;

import org.apache.camel.builder.RouteBuilder;
import  org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

    @Override
    public void configure() {
        from("file:files/input")
            .log("${body}")
            .to("file:files/output");
    }

}
