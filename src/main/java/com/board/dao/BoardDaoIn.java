package com.board.dao;

import java.util.List;

import com.board.vo.BoardVO;

public interface BoardDaoIn {
	public void boardWriter(BoardVO vo)throws Exception;
	public BoardVO boardRead(Integer bno)throws Exception;
	public void boardUpdate(BoardVO vo)throws Exception;
	public void boardDelete(Integer bno)throws Exception;
	public List<BoardVO> boardList()throws Exception;
}
