package com.mcart.ProductsMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.util.UrlPathHelper;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsMsApplication.class, args);
	}
	//Support matrix parameters
			public void configurePathMatch(PathMatchConfigurer configurer) {
		        UrlPathHelper urlPathHelper = new UrlPathHelper();
		        urlPathHelper.setRemoveSemicolonContent(false);
		        configurer.setUrlPathHelper(urlPathHelper);
		   }
}
