package com.bit.daNaOutlet.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.bit.daNaOutlet.model.entity.ClipVo;
import com.bit.daNaOutlet.model.entity.HotDealVo;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

public class MemberDaoImpl implements MemberDao {
	SqlSession session;

	Logger log;
	
	public MemberDaoImpl() {
		try {
			log=Logger.getLogger(Class.forName("com.bit.daNaOutlet.model.MemberDaoImpl"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	//ȸ������ List
	@Override
	public List<MemberVo> selectAll() throws Exception {
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.selectAll");
	}
	//ȸ������ �Ż�����
	@Override
	public MemberVo selectOne(int mnum) throws Exception {
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.selectOne",mnum);
	}
	//ȸ�� ���Խ� Insert
	@Override
	public void memberAdd(MemberVo bean) {
		session.insert("com.bit.daNaOutlet.model.MemberDao.memberAdd",bean);	
	}
	// DANAMEMBER table �� primary key max �� ��ȸ ,ȸ�� ��ȣ �����̸Ӹ�Ű ������ ��� ��� ���ִ� Dao
	@Override
	public int mNumOne() throws Exception {  
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.mnumOne");
	}
	
	// HOTDEAL table �� primary key max �� ��ȸ ,ȸ�� ��ȣ �����̸Ӹ�Ű ������ ��� ��� ���ִ� Dao
	@Override
	public int hotDealNumOne() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.hotDealNumOne");
	}
	// HOTDEAL DB insert �� �̹��� ���ε�
	@Override
	public void hotDealAdd(HotDealVo bean) {
		session.insert("com.bit.daNaOutlet.model.MemberDao.hotDealAdd",bean);		
	}
	// HOTDEAL �� ����� �� ���� count
	@Override
	public int hotDealCount() throws Exception {
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.hotDealCount");
	}
	// �ֵ� ����Ʈ ���� 
	@Override
	public List<HotDealVo> hotDealAll() throws Exception {		
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.hotDealAll");
	}
	// Ŭ��
	@Override
	public List<ClipVo> clipList() throws Exception {
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.clipList");
	}
	// �α���
	@Override
	public int login(LoginVo bean) throws Exception {
		//�����׽�Ʈ �Ϸ�		
		return (Integer)session.selectOne("com.bit.daNaOutlet.model.MemberDao.loginChk", bean);		
		
				
	}
	
}
