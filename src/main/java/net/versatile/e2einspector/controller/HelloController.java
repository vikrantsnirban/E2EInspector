package net.versatile.e2einspector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@GetMapping("/")
	String greetings() {
		return "Hello from E2EInspector Application";
	}

}
