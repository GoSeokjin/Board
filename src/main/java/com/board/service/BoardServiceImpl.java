package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDaoImpl;
import com.board.vo.BoardVO;

//서비스임을 명시
@Service
public class BoardServiceImpl implements BoardServiceIn {

	//DAO주입
	@Inject
	private BoardDaoImpl dao;
	
	@Override
	public void boardWriter(BoardVO vo) throws Exception {
		dao.boardWriter(vo);
	}

	@Override
	public BoardVO boardRead(Integer bno) throws Exception {
		return dao.boardRead(bno);
	}

	@Override
	public void boardUpdate(BoardVO vo) throws Exception {
		dao.boardUpdate(vo);
	}

	@Override
	public void boardDelete(Integer bno) throws Exception {
		dao.boardDelete(bno);
	}

	@Override
	public List<BoardVO> boardList() throws Exception {
		return dao.boardList();
	}

}
