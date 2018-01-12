package com.bit.daNaOutlet.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberService {

	void selectAll(Model model) throws Exception;

	void selectOne(Model model, int mnum) throws Exception;

	void memberAdd(MemberVo bean) throws Exception;
	
	
}
