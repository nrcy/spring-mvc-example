package top.nrcynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import top.nrcynet.bean.DataModel;

@Controller
public class Demo02RequestAttributeController {

	@RequestMapping("d2m1")
	public String d2m1() {
		return "success";
	}
	
	@RequestMapping("d2m2")
	@ResponseBody
	public String d2m2(@RequestParam("str01") String str01) {
		
		return "刚刚输入的是：" + str01;
	}
	
	@RequestMapping("d2m3")
	@ResponseBody
	public DataModel d2m3(@RequestBody DataModel dataModal) {
		
		return dataModal;
	}
	
}
