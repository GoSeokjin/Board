package com.board.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//메인화면
	@RequestMapping(value= "/boardMain" , method=RequestMethod.GET)
	public String boardMain()throws Exception{
		logger.info("Main호출");
		return "boardMain";
	}
	
	//글쓰기
	@RequestMapping(value = "/boardWriter" , method = RequestMethod.GET)
	public String boardWriter()throws Exception{
		logger.info("Writer호출");
		return "boardWriter";
	}
}
