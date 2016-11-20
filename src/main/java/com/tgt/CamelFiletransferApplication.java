package com.tgt;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelFiletransferApplication {

	public static void main(String[] args) {

		SpringApplication.run(CamelFiletransferApplication.class, args);

		SimpleRouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
		CamelContext camelContext = new DefaultCamelContext();
		try
		{
			camelContext.addRoutes(simpleRouteBuilder);
			camelContext.start();
			Thread.sleep(5*60*1000);
			camelContext.stop();
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
