package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodControllerDemo06 {

	@RequestMapping("d6m1")
	public String d6m1() {
		return "success";
	}

	//@GetMapping
	@RequestMapping(value = "d6m2", method = RequestMethod.GET)
	public String d6m2() {
		return "success";
	}
	
	//@PostMapping
	@RequestMapping(value = "d6m3", method = RequestMethod.POST)
	public String d6m3() {
		return "success";
	}
}
