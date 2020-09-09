package top.nrcynet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class Demo08SessionController {

	@RequestMapping("d8m1")
	public String d8m1() {
		return "success";
	}
	
	@RequestMapping("d8m2")
	public String d8m2(HttpServletRequest request,
			HttpServletResponse response) {
		String sessionString = request.getParameter("session");
		HttpSession session = request.getSession();
		session.setAttribute("session", sessionString);
		return "success";
	}
	
	@RequestMapping("d8m3")
	@ResponseBody
	public String d8m3(@SessionAttribute("session") String session) {
		return session;
	}
}
