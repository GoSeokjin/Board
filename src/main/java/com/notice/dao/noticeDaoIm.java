package com.notice.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.notice.vo.noticeVO;

@Repository
public class noticeDaoIm implements noticeDao {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.project.mapper.noticeMapper";
	
	
	@Override
	public void insertNotice(noticeVO vo) throws Exception {
		session.insert(namespace + ".noticeWriter" , vo);
 }
}
