package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 这是个入门程序
 */
@Controller
public class SimpleController {
	
	@RequestMapping("d1m1")
	public String d1m1() {
		return "helloworld";
	}
	
	@RequestMapping("d1m2")
	@ResponseBody
	public String d1m2() {
		return "这里是方法直出字符串，helloworld";
	}
}
