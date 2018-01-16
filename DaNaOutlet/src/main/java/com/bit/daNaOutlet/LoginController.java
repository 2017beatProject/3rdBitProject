package com.bit.daNaOutlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService memberService;

	// 로그인으로 아이디 비번 체크
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void loginChk(HttpServletResponse resp, @ModelAttribute LoginVo bean) throws Exception {
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.print(memberService.login(bean));
	}

	//카카오톡으로 로그인
	@RequestMapping(value = "/loginKakao", method = RequestMethod.POST)
	public void loginKakao(HttpServletResponse resp, @ModelAttribute LoginVo bean) throws Exception {
		resp.setCharacterEncoding("UTF-8");
		System.out.println("카카오아이디:"+bean.getLoginId());
		PrintWriter out = resp.getWriter();
		out.print(memberService.loginKakao(bean));
	}
	
}