package com.board.controller;


import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.service.BoardServiceImpl;
import com.board.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//메인화면 ( 리스트 페이지 )
	@RequestMapping(value= "/boardMain" , method=RequestMethod.GET)
	public String boardMain(Model model)throws Exception{
		logger.info("Main 호출 ");
		logger.info(service.boardList().toString());
		model.addAttribute("list", service.boardList());
		return "boardMain";
	}
	
	//글쓰기 페이지
	@RequestMapping(value = "/boardWriter" , method = RequestMethod.GET)
	public String boardWriter()throws Exception{
		logger.info("Writer호출");
		return "boardWriter";
	}
	
	@RequestMapping(value = "/boardWriter" , method = RequestMethod.POST)
	public String boardWriterPOST(BoardVO vo , Model model)throws Exception{
		logger.info(vo.toString());
		service.boardWriter(vo);
		return "redirect:/board/boardMain";
	}
	
	@RequestMapping(value= "/boardUpdate" , method = RequestMethod.GET )
	public String boardUpdateGet(@RequestParam("bno")int bno , Model model)throws Exception{
		logger.info("호출된 객체 : " + service.boardRead(bno).toString());
		model.addAttribute("boardVO" , service.boardRead(bno));
		return "boardUpdate";
	}
	
	@RequestMapping(value= "/boardUpdate" , method = RequestMethod.POST)
	public String boardUpdatePost(BoardVO vo)throws Exception{
		logger.info("update : " + vo.toString());
		service.boardUpdate(vo);
		return "redirect:/board/boardMain";
	}
	
	@RequestMapping(value= "/boardDelete" , method = RequestMethod.GET)
	public String boardDelete(@RequestParam("bno")int bno)throws Exception{
		logger.info("delete");
		service.boardDelete(bno);
		return "redirect:/board/boardMain";
	}
	
	
}
