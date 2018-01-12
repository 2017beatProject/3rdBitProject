package com.bit.daNaOutlet.model;

import java.util.List;

import com.bit.daNaOutlet.model.entity.MemberVo;

public interface MemberDao {

	List<MemberVo> selectAll() throws Exception;

	Object selectOne(int mnum) throws Exception;
} 
