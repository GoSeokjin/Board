package com.member.service;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.member.dao.MemberDaoImpl;
import com.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDaoImpl dao;
	
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		dao.insertMember(vo);
	}

	@Override
	public MemberVO loginMember(HashMap<String, String> loginMember) throws Exception {
		return dao.loginMember(loginMember);
	}
	
}
