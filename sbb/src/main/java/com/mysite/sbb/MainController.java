<<<<<<< HEAD
package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
=======
package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
