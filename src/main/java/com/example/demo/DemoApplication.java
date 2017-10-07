package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.aspectj.weaver.ast.Test;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class DemoApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);

		// customize application settings
		app.setBannerMode(Banner.Mode.OFF);
		app.setLogStartupInfo(false);

		ConfigurableApplicationContext appContext = app.run(args);
		TestObject obj = appContext.getBean(TestObject.class);
		obj.doSomeCrap();
	}

	@Component
	private static class TestObject {
		public void doSomeCrap(){
			System.out.println("Hey what's up");
			System.out.println("Hey what's up");
			System.out.println("Hey what's up");
		}
	}
}
