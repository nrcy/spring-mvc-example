package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathVariableControllerDemo03 {

	@RequestMapping("d3m1")
	public String d3m1() {
		return "success";
	}
	
	@RequestMapping("d3m2/{name}")
	@ResponseBody
	public String d3m2(@PathVariable("name") String name) {
		return "这里的url为:/d3m2/" + name + "!	键入值为:" + name;
	}
	
}
