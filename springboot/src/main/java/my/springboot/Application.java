package my.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置  
@ComponentScan//组件扫描，自动扫描子包
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run("classpath:application-context.xml", args);
	}

	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
		
	}

}
