package org.example.demo.ticket.batch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Configuration class - Boostraping - replace configuration xml files 
 * @author bob
 *
 */
@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/applicationContext.xml")
public class SpringConfiguration {

}
