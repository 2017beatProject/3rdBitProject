package com.bit.daNaOutlet.model;

import java.util.List;

import com.bit.daNaOutlet.model.entity.ClipVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberDao {
	//ȸ������, ȸ������ Dao
	List<MemberVo> selectAll() throws Exception;

	Object selectOne(int mnum) throws Exception;
	int mNumOne() throws Exception;
	void memberAdd(MemberVo bean);
	
	//Ŭ�� Dao
	List<ClipVo> clipList() throws Exception;
} 