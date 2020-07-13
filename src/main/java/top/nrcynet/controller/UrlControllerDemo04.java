package top.nrcynet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlControllerDemo04 {

	@RequestMapping("d4m1")
	public String d4m1() {
		return "success";
	}
	
	@RequestMapping("d4m2")
	public String d4m2() {
		return "redirect:d4m1";
	}
	
	@RequestMapping("d4m3")
	public String d4m3(HttpServletRequest request,
			HttpServletResponse response) {
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		return "forward:/view/d4m3.jsp";
	}
}
