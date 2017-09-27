package edu.java.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("enable config");
		configurer.enable();
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("--- create bean");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setOrder(1);
		resolver.setPrefix("/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public TilesConfigurer tilesConfigure(){
		TilesConfigurer configure = new TilesConfigurer();
		configure.setDefinitions("/tiles/definitions.xml");
		return configure;
	}
	
}
