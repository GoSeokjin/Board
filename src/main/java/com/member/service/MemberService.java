package com.member.service;

import java.util.HashMap;

import com.member.vo.MemberVO;

public interface MemberService {
	public void insertMember(MemberVO vo)throws Exception;
	public MemberVO loginMember(HashMap<String, String> loginMember)throws Exception;
}
