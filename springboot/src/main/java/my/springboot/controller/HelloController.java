package my.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	public HelloService helloService;
	
	@RequestMapping("/2")
	String home() {
		return helloService.get();
	}
}
