package com.notice.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.notice.dao.noticeDaoIm;
import com.notice.vo.noticeVO;

@Service
public class noticeServiceIm implements noticeService{

	@Inject
	private noticeDaoIm dao;
	
	@Override
	public void insertNotice(noticeVO vo) throws Exception {
		dao.insertNotice(vo);
	}

}
