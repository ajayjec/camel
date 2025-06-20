package com.learntogrow.camel.Routes;

import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;

 // Processing - does not make any changes to the message
    // Transformation - changes the message content
    // Enrichment - adds additional information to the message
    // Routing - directs the message to a different endpoint    


public class MyFirstRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:myTimer?period=1000")
            //.setBody(simple("Hello World!"))
            .transform().constant("Hello World!")
            .to("log:myLogger");
    }

   

}
