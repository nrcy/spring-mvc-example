package top.nrcynet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonView;

import top.nrcynet.bean.DataModal;
import top.nrcynet.bean.DataModal.GetOneParam;
import top.nrcynet.bean.DataModal.GetTwoParam;

@Controller
public class JsonControllerDemo07 {

	@Autowired
	private DataModal dataModal;
	
	@RequestMapping("d7m1")
	public String d7m1(){
		return "success";
	}
	
	@RequestMapping(value="d7m2", method=RequestMethod.POST)
	@ResponseBody
	public String d7m2(@RequestParam("str01") String str01,
			@RequestParam("str02") String str02) {
		dataModal.setStr01(str01);
		dataModal.setStr02(str02);
		return "{\"result\": \"true\"}";
 	}
	
	
	@JsonView(GetOneParam.class)
	@RequestMapping("d7m3")
	@ResponseBody
	public DataModal d7m3() {
		return dataModal;
	}

	@JsonView(GetTwoParam.class)
	@RequestMapping("d7m4")
	@ResponseBody
	public DataModal d7m4() {
		return dataModal;
	}
}
