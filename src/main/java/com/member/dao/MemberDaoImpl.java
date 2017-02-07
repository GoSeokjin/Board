package com.member.dao;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.member.vo.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Inject
	private SqlSession session;
	// mybatis name
	private static String namespace = "com.project.mapper.memberMapper";

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		System.out.println(vo.toString());
		session.insert(namespace + ".insertMember", vo);
	}

	@Override
	public MemberVO loginMember(HashMap<String, String> loginMember) throws Exception {
		return session.selectOne(namespace + ".loginMember" , loginMember);
	}

}
