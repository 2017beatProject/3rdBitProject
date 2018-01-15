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
	
	//회원관리 List
	@Override
	public List<MemberVo> selectAll() throws Exception {
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.selectAll");
	}
	//회원개인 신상정보
	@Override
	public MemberVo selectOne(int mnum) throws Exception {
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.selectOne",mnum);
	}
	//회원 가입시 Insert
	@Override
	public void memberAdd(MemberVo bean) {
		session.insert("com.bit.daNaOutlet.model.MemberDao.memberAdd",bean);	
	}
	// DANAMEMBER table 의 primary key max 값 조회 ,회원 번호 프라이머리키 시퀀스 기능 대신 해주는 Dao
	@Override
	public int mNumOne() throws Exception {  
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.mnumOne");
	}
	
	// HOTDEAL table 의 primary key max 값 조회 ,회원 번호 프라이머리키 시퀀스 기능 대신 해주는 Dao
	@Override
	public int hotDealNumOne() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.hotDealNumOne");
	}
	// HOTDEAL DB insert 및 이미지 업로드
	@Override
	public void hotDealAdd(HotDealVo bean) {
		session.insert("com.bit.daNaOutlet.model.MemberDao.hotDealAdd",bean);		
	}
	// HOTDEAL 에 저장된 값 갯수 count
	@Override
	public int hotDealCount() throws Exception {
		return session.selectOne("com.bit.daNaOutlet.model.MemberDao.hotDealCount");
	}
	// 핫딜 리스트 정보 
	@Override
	public List<HotDealVo> hotDealAll() throws Exception {		
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.hotDealAll");
	}
	// 클립
	@Override
	public List<ClipVo> clipList() throws Exception {
		return session.selectList("com.bit.daNaOutlet.model.MemberDao.clipList");
	}
	// 로그인
	@Override
	public int login(LoginVo bean) throws Exception {
		//단위테스트 완료		
		return (Integer)session.selectOne("com.bit.daNaOutlet.model.MemberDao.loginChk", bean);		
		
				
	}
	
}
