package com.bit.daNaOutlet.model;

import java.util.List;

import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberDao {

	List<MemberVo> selectAll() throws Exception;
	MemberVo selectOne(int mnum) throws Exception;
	int mNumOne() throws Exception;
	void memberAdd(MemberVo bean);
	
} 
