package com.bit.daNaOutlet.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bit.daNaOutlet.model.MemberDao;
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

}