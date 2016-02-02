package test.consumer;

import my.springboot.service.MytestService;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
	public static void main(String[] args) throws Exception {    
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});   
		context.start();    
		MytestService demoService = (MytestService)context.getBean("mytestService"); // 获取远程服务代理       
		String hello = demoService.get(); // 执行远程方法          
		System.out.println( hello ); // 显示调用结果     } 
		System.in.read(); // 按任意键退出     } 
	}
}
