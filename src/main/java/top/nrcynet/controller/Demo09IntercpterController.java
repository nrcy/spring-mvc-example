package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo09")
public class Demo09IntercpterController {
	
	@RequestMapping("/m1")
	public String d9m1() {
		
		return "success";
	}
	
	@RequestMapping("/m2")
	public String d9m2() {
		return "success";
	}
	
}
