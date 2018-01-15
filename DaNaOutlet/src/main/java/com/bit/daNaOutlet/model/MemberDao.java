package com.bit.daNaOutlet.model;

import java.util.List;

import com.bit.daNaOutlet.model.entity.ClipVo;
import com.bit.daNaOutlet.model.entity.HotDealVo;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberDao {
	/* -- 회원 관련 DAO -- */
	List<MemberVo> selectAll() throws Exception;
	MemberVo selectOne(int mnum) throws Exception;
	int mNumOne() throws Exception;
	
	/* -- 핫딜 관련 DAO -- */
	void memberAdd(MemberVo bean);
	void hotDealAdd(HotDealVo bean);
	int hotDealNumOne() throws Exception;
	int hotDealCount() throws Exception;
	List<HotDealVo> hotDealAll() throws Exception;
	
	/* -- 클립 관련 DAO -- */
	List<ClipVo> clipList() throws Exception;
	
	/* -- 로그인 관련 DAO -- */
	int login(LoginVo bean)throws Exception;
} 
