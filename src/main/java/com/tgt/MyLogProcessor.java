package com.tgt;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by a522467 on 11/20/16.
 */
public class MyLogProcessor implements Processor {
    @Override
    public void process(Exchange exchange)
    {
        System.out.println("Now processing the string:"+exchange.getIn().getBody(String.class));
    }
}
