package com.tgt;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by a522467 on 11/20/16.
 */
public class SimpleRouteBuilder extends RouteBuilder{

    @Override
    public  void configure()
    {
        String home = System.getProperty("user.home");
        System.out.println("home................="+home);
        from("file:/tmp/backup1?noop=true")
                .process(new MyLogProcessor())
                .bean(new MyTransformer(),"transformContent")
                .process(new MyLogProcessor())
                .to("file:/tmp/backup2");
    }
}
