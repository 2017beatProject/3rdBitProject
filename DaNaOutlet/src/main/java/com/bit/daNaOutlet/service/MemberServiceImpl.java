package com.bit.daNaOutlet.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bit.daNaOutlet.model.MemberDao;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

@Component
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao dao;
	
	@Override
	public void selectAll(Model model) throws Exception {		
		model.addAttribute("list",dao.selectAll());
		
	}

	@Override
	public void selectOne(Model model, int mnum) throws Exception {
		model.addAttribute("bean",dao.selectOne(mnum));
		
	}
	
	@Override
	public void memberAdd(MemberVo bean) throws Exception {
		bean.setMnum(dao.mNumOne()); // ��ȣ�� bean ��������ʾƼ� dao���� �ƽ���+1�� ���� set�� 
		dao.memberAdd(bean);	
	}

	
	@Override
	public void clipList(Model model) throws Exception {		
		model.addAttribute("clipList",dao.clipList());
		
	}

	@Override
	public String login(LoginVo bean) throws Exception {		
				
				System.out.println("��ȸ���� ���ΰ�?"+dao.login(bean));
		if(dao.login(bean)>0) {
		return "�α���Ȯ��";		
		}else {
			return "�α��ν���";
		}
	}

	@Override
	public String loginKakao(LoginVo bean) throws Exception {
		bean.setIdKakaoLog(dao.kakolognum());
		if(dao.loginKakao(bean)>0) {return "�α���Ȯ��";}
		
		return "�α��ν���";
	}

}