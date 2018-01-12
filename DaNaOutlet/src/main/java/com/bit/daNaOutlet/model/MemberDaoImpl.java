package com.bit.daNaOutlet.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bit.daNaOutlet.model.entity.MemberVo;

public class MemberDaoImpl implements MemberDao {
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public List<MemberVo> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.selectAll");
	}

	@Override
	public Object selectOne(int mnum) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.selectOne",mnum);
	}

}
