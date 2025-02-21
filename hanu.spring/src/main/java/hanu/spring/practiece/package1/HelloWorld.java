package hanu.spring.practiece.package1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping(value="/hello")
	public String helloworld() {
		return "hello world";
	}

}
