package com.bit.daNaOutlet;

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
	
	//����ȭ��
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {

		memberService.selectAll(model);
		return "main";
	}
	//ȸ������
	@RequestMapping(value="/join",method = RequestMethod.GET)
	public String join() {
		
		return "join";
	}
	//�α���ȭ��
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		
		return "login/login";
	}
	
	//ȸ������
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String memberList(Model model) throws Exception {

		memberService.selectAll(model);
		return "member/memberView";
	}
	
	//ȸ�����νŻ���ȸ
	@RequestMapping(value="/member/{mnum}", method=RequestMethod.GET)
	public String memberOne(@PathVariable("mnum") int mnum, Model model) throws Exception {
		memberService.selectOne(model , mnum);

		return "member/memberOne";
	}
	
	@RequestMapping(value="/join",method = RequestMethod.POST) // ȸ�� ���� �κ� 
	public String joinSuccess(@ModelAttribute MemberVo bean) throws Exception {
		memberService.memberAdd(bean);		
		return "member/success";
	}
	
	
	//Ŭ�� ����
	@RequestMapping(value="/clip/",method=RequestMethod.GET)
	public String clipList(Model model) throws Exception {
		memberService.clipList(model);
		return "clip/main";
	}
	
}