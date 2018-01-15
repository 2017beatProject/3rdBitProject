package com.bit.daNaOutlet.model;

import java.util.List;

import com.bit.daNaOutlet.model.entity.ClipVo;
import com.bit.daNaOutlet.model.entity.HotDealVo;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberDao {
	/* -- ȸ�� ���� DAO -- */
	List<MemberVo> selectAll() throws Exception;
	MemberVo selectOne(int mnum) throws Exception;
	int mNumOne() throws Exception;
	
	/* -- �ֵ� ���� DAO -- */
	void memberAdd(MemberVo bean);
	void hotDealAdd(HotDealVo bean);
	int hotDealNumOne() throws Exception;
	int hotDealCount() throws Exception;
	List<HotDealVo> hotDealAll() throws Exception;
	
	/* -- Ŭ�� ���� DAO -- */
	List<ClipVo> clipList() throws Exception;
	
	/* -- �α��� ���� DAO -- */
	int login(LoginVo bean)throws Exception;
} 
