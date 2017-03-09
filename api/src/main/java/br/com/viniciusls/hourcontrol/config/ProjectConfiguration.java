package br.com.viniciusls.hourcontrol.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by vinicius.silva on 01/02/2017.
 */
@SpringBootApplication
@Configuration
@EnableWebMvc
@EnableJpaRepositories(basePackages = {
        "br.com.viniciusls.hourcontrol.rest"
})
@ComponentScan(basePackages = "br.com.viniciusls.hourcontrol")
@EntityScan("br.com.viniciusls.hourcontrol.models")
public class ProjectConfiguration extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run (ProjectConfiguration.class, args);
    }
}