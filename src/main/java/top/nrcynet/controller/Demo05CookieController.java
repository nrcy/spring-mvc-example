package top.nrcynet.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo05CookieController {

	@RequestMapping("d5m1")
	public String d5m1() {
		return "success";
	}
	
	@RequestMapping("d5m2")
	public String d5m2(HttpServletRequest request,
			HttpServletResponse response) {
		
		String cookieData = request.getParameter("cookie");
		Cookie cookie = new Cookie("cookie01", cookieData);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		
		return "success";
		
	}

	@RequestMapping("d5m3")
	@ResponseBody
	public String d5m3(@CookieValue("cookie01") String cookie) {
		
		return "设置的cookie为：" + cookie;
		
	}
}
