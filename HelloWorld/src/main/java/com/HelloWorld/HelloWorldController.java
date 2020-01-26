package com.HelloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	@RequestMapping(path = "/")
	public String home()
	{
		System.out.println("Hello world");
		return "Hello World";
	}
	
	@RequestMapping(path = "/helloworld")
	public String helloWorld()
	{
		System.out.println("Hello world");
		return "Hello World";
	}
	
	@RequestMapping(path = "/helloworldbean")
	public helloWorldBean helloWorldBean()
	{
		System.out.println("Hello world bean");
		return new helloWorldBean("Hello World bean");
	}
	
	@RequestMapping(path = "/helloworld/path-variable/{name}")
	public helloWorldBean helloWorldPathVa(@PathVariable String name)
	{
		System.out.println("Hello world pathval");
		return new helloWorldBean(String.format("Hello World, %s", name));
//		throw new RuntimeException("Something went wrong");
	}


}
