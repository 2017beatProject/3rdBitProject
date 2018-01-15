package com.bit.daNaOutlet.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.bit.daNaOutlet.model.entity.ClipVo;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;

public class MemberDaoImpl implements MemberDao {
	SqlSession session;

	Logger log;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	public MemberDaoImpl() {
		// TODO Auto-generated constructor stub
		try {
			log=Logger.getLogger(Class.forName("com.bit.daNaOutlet.model.MemberDaoImpl"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ȸ������
	@Override
	public List<MemberVo> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.selectAll");
	}

	@Override
	public Object selectOne(int mnum) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.selectOne", mnum);
	}

	@Override
	public int mNumOne() throws Exception { // ȸ�� ��ȣ �����̸Ӹ�Ű ������ ��� ��� ���ִ� Dao
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.mnumOne");
	}

	@Override
	public void memberAdd(MemberVo bean) {
		session.insert("com.bit.daNaOutlet.model.MemberDao.memberAdd", bean);
	}

	// Ŭ��
	@Override
	public List<ClipVo> clipList() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.clipList");
	}

	@Override//�α��� ���̵� ��� Ȯ��- 1 - Ȯ�� 2 - ����
	public int login(LoginVo bean) throws Exception {
		//�����׽�Ʈ �Ϸ�		
		return (Integer)session.selectOne("com.bit.daNaOutlet.model.MemberDao.loginChk", bean);		
		
				
	}

	
	@Override//īī���� �α���
	public int loginKakao(LoginVo bean) {
		
		return session.insert("com.bit.daNaOutlet.model.MemberDao.loginKakao",bean);
	}

	@Override
	public int kakolognum() throws Exception { // ȸ�� ��ȣ �����̸Ӹ�Ű ������ ��� ��� ���ִ� Dao
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.mnumOne");
	}
	
}