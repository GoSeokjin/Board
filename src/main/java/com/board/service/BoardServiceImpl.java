package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDaoImpl;
import com.board.vo.BoardVO;
import com.board.vo.Criteria;


//�꽌鍮꾩뒪�엫�쓣 紐낆떆
@Service
public class BoardServiceImpl implements BoardServiceIn {

	//DAO二쇱엯
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

	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		return dao.listPage(page);
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPagin(cri);
	}

}
