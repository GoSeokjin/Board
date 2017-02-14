package com.member.controller;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.controller.BoardController;
import com.member.service.MemberService;
import com.member.service.MemberServiceImpl;
import com.member.vo.MemberVO;

@Controller
@RequestMapping(value="/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private MemberServiceImpl service;
	
	@RequestMapping(value = "/insertMember" ,method = RequestMethod.POST)
	public void insertMember(MemberVO vo , Model model)throws Exception{
		service.insertMember(vo);
	}
	
	@RequestMapping(value = "/memberLogin",method = RequestMethod.POST)
	public String memberLogin(HttpSession sesison ,HttpServletResponse response, @RequestParam("mid")String mid,  @RequestParam("mpassword")String mpassword, Model model)throws Exception{
		HashMap<String, String> loginMember = new HashMap<String, String>();
		loginMember.put("mid", mid);
		loginMember.put("mpassword", mpassword);
		
		MemberVO m = service.loginMember(loginMember);
		if(m != null){
			sesison.setAttribute("member", m);
		}else{
			PrintWriter writer= response.getWriter();
			writer.println("<script>alert('please check your id , pw'); location.href='/';</script>");
		}
		logger.info(m.toString());
		return "redirect:/board/boardMain";
	}
	@RequestMapping(value="/logoutMember")
	public String logoutMember(HttpSession session)throws Exception{
		session.removeAttribute("member");
		return "/";
	}
	
}
