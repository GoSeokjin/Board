package com.notice.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.notice.service.noticeServiceIm;
import com.notice.vo.noticeVO;

@Controller
@RequestMapping("/notice/*")
public class noticeController {

	@Inject
	private noticeServiceIm service;
	
	@RequestMapping(value = "/insert" , method = RequestMethod.GET)
	public String noticeInsertForm()throws Exception{
		return "noticeInsertForm";
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String noticeInsert(noticeVO vo)throws Exception{
		service.insertNotice(vo);
		return "boardMain";
	}
}
