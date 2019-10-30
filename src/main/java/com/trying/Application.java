package com.trying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* @Title: Application
* @Description:  启动类 和 Controller 有共同的父包 ,如果 启动类 和 controller 没有共同的父包，则需要在启动上增加@ComponentScan注解
* @author huxx
* @date 2019/10/30 下午3:19
* @update
*/
@SpringBootApplication
@EnableZuulProxy
public class Application {
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		SpringApplication app = new SpringApplication(Application.class);
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);

	}

}
