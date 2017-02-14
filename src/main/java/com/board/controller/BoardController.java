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
import com.board.vo.Criteria;
import com.board.vo.PageMaker;
import com.board.vo.SearchCriteria;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
/*	//硫붿씤�솕硫� ( 由ъ뒪�듃 �럹�씠吏� )
	@RequestMapping(value= "/boardMain" , method=RequestMethod.GET)
	public String boardMain(Model model)throws Exception{
		model.addAttribute("list" , service.boardList());
		return "boardMain";
	}*/
	
	//湲��벐湲� �럹�씠吏�
	@RequestMapping(value = "/boardWriter" , method = RequestMethod.GET)
	public String boardWriter()throws Exception{
		logger.info("Writer");
		return "boardWriter";
	}
	@RequestMapping(value = "/boardRead" ,  method = RequestMethod.GET)
	public String boardRead(@RequestParam("bno")int bno , Model model)throws Exception{
		BoardVO vo = service.boardRead(bno);
		model.addAttribute("vo" , vo);
		return "boardRead";
	}
	
	@RequestMapping(value = "/boardWriter" , method = RequestMethod.POST)
	public String boardWriterPOST(BoardVO vo , Model model)throws Exception{
		logger.info(vo.toString());
		service.boardWriter(vo);
		return "redirect:/board/boardMain";
	}
	
	@RequestMapping(value= "/boardUpdate" , method = RequestMethod.GET )
	public String boardUpdateGet(@RequestParam("bno")int bno , Model model)throws Exception{
		logger.info("�샇異쒕맂 媛앹껜 : " + service.boardRead(bno).toString());
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
	
	@RequestMapping(value="/boardMain" , method = RequestMethod.GET)
	public String listAll(SearchCriteria cri , Model model)throws Exception{
		logger.info("show list page with Criteria............");
		model.addAttribute("list" , service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		logger.info(pageMaker.toString());
		model.addAttribute("pageMaker" , pageMaker);
		return "boardMain";
	}
	
	
	
}
