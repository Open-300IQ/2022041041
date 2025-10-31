<<<<<<< HEAD
package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	
	public String hello() {
		return "Hello World";
	}
	
	
}
=======
package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	
	public String hello() {
		return "Hello World";
	}
	
	
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
