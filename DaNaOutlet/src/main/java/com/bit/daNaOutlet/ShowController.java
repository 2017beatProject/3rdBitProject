package com.bit.daNaOutlet;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.daNaOutlet.model.entity.MemberVo;
import com.bit.daNaOutlet.service.MemberService;



@Controller
public class ShowController {
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		memberService.selectAll(model);
		return "main";
	}
	
	@RequestMapping(value="/join",method = RequestMethod.GET)
	public String join() {		
		return "join";
	}
	@RequestMapping(value="/join",method = RequestMethod.POST) // ȸ�� ���� �κ� 
	public String joinSuccess(@ModelAttribute MemberVo bean,Model model) throws Exception {
		memberService.memberAdd(bean);		
		return "member/success";
	}
	@RequestMapping(value="/login")
	public String login() {		
		return "login";
	}
		
	@RequestMapping(value="/member", method=RequestMethod.GET)  // ȸ�� ��� ��ü ���� 
	public String memberList(Model model) throws Exception {
		memberService.selectAll(model);
		return "member/memberView";
	}
	@RequestMapping(value="/member/{mnum}", method=RequestMethod.GET)  // ȸ�� 1������ ��� ����
	public String memberOne(@PathVariable("mnum") int mnum, Model model) throws Exception {
		memberService.selectOne(model , mnum);
		return "member/memberOne";
	} 
}
