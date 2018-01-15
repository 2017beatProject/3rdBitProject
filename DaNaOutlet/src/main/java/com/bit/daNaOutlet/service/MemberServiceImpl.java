package com.bit.daNaOutlet.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.bit.daNaOutlet.model.MemberDao;
import com.bit.daNaOutlet.model.entity.HotDealVo;
import com.bit.daNaOutlet.model.entity.LoginVo;
import com.bit.daNaOutlet.model.entity.MemberVo;
import com.bit.daNaOutlet.util.Commons;

@Component
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao dao;
	
	@Override
	public void selectAll(Model model) throws Exception {		
		model.addAttribute("list",dao.selectAll());		
	}

	@Override
	public void selectOne(Model model, int mnum) throws Exception {
		model.addAttribute("bean",dao.selectOne(mnum));	
	}
	
	@Override
	public void memberAdd(MemberVo bean) throws Exception {
		bean.setMnum(dao.mNumOne()); // 번호는 bean 담아있지않아서 dao에서 맥스값+1한 값을 set함 
		dao.memberAdd(bean);	
	}

	@Override
	public String hotDealAdd(HotDealVo bean,MultipartFile file,HttpServletRequest req) throws Exception {
		if(10<=dao.hotDealCount()) { // db에 저장값이 10개이상이면 밑에 수행안하구 리턴
			return "failed";
		}
		Commons comUp = new Commons();
		// imgs/hotdealimgs 에다가 파일업로드 및 리턴타입 String 으로 저장할 이름값 리턴
		bean.setProductName(comUp.commonsUp(bean.getProductName(), file,req)); 
		bean.setHotDealNum(dao.hotDealNumOne());
		dao.hotDealAdd(bean); // db에 파일 정보 저장
		return "success";
	}

	@Override
	public void hotDealAll(Model model) throws Exception {
		model.addAttribute("list",dao.hotDealAll());
	}
	
	@Override
	public void clipList(Model model) throws Exception {		
		model.addAttribute("clipList",dao.clipList());
		
	}

	@Override
	public String login(LoginVo bean) throws Exception {		
				
				System.out.println("조회값이 얼마인가?"+dao.login(bean));
		if(dao.login(bean)>0) {
		return "로그인확인";		
		}else {
			return "로그인실패";
		}
	}

}
