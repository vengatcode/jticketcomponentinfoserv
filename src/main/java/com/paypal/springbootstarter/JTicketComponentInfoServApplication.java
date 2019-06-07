/**
 * 
 */
package com.paypal.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author vrathinavel
 *
 */
@ComponentScan({"com.paypal.springbootstarter.comp.info"})
@SpringBootApplication	
public class JTicketComponentInfoServApplication {

	public static void main(String[] args) {
		SpringApplication.run(JTicketComponentInfoServApplication.class, args);

	}

}
