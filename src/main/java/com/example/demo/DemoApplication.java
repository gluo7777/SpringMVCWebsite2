package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemoApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);

		// customize application settings
		app.setBannerMode(Banner.Mode.OFF);
		app.setLogStartupInfo(false);

		ApplicationContext appContext = app.run(args);
	}
}
