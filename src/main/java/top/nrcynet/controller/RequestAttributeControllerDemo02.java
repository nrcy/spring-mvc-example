package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestAttributeControllerDemo02 {

	@RequestMapping("d2m1")
	public String d2m1() {
		return "success";
	}
	
	@RequestMapping("d2m2")
	@ResponseBody
	public String d2m2(@RequestParam("name") String name) {
		return "刚刚输入的是：" + name;
	}
}
