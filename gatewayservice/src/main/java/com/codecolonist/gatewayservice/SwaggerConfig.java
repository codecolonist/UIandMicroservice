package com.codecolonist.gatewayservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Primary
public class SwaggerConfig implements SwaggerResourcesProvider{                                    
	


	@Autowired
	RouteLocator routeLocator;
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				// Whether to open
				.enable(true).select()
				// Scanning Path Pack
				.apis(RequestHandlerSelectors.basePackage("com.codecolonist.gatewayservice"))
				// Specify a path to process PathSelectors.any() to represent all paths
				.paths(PathSelectors.any()).build().pathMapping("/");
	}

	//Setting up api information
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API Gateway")
				.description("oKong | Staggering ape")
				.version("1.0.0")
				.termsOfServiceUrl("https://github.com/xie19900123/")
				.build();
	}

	public List<SwaggerResource> get() {
		//Dynamic introduction of micro services using routeLocator
		List<SwaggerResource> resources = new ArrayList<>();
		resources.add(swaggerResource("gatewayservice","/v2/api-docs","1.0"));
		//Recycling Lambda expressions to simplify code
		routeLocator.getRoutes().forEach(route ->{
			//Dynamic acquisition
			resources.add(swaggerResource(route.getId(),route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
		});
		//You can also directly inherit the Consumer interface
//		routeLocator.getRoutes().forEach(new Consumer<Route>() {
//
//			@Override
//			public void accept(Route t) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		return resources;
	}
	
	private SwaggerResource swaggerResource(String name,String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}