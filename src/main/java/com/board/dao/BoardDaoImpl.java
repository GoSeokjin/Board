package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.vo.BoardVO;

//Dao 임을 명시
@Repository
public class BoardDaoImpl implements BoardDaoIn{
	
	//세션 주입
    @Inject
    private SqlSession session;
    
    //mybatis name 
    private static String namespace = "com.project.mapper.boardMapper";
	
    //글입력 
	@Override
	public void boardWriter(BoardVO vo) throws Exception {
		session.insert(namespace + ".boardWriter" , vo); 
	}

	@Override
	public BoardVO boardRead(Integer bno) throws Exception {
		return session.selectOne(namespace + ".boardRead" , bno);
	}

	@Override
	public void boardUpdate(BoardVO vo) throws Exception {
		session.update(namespace + ".boardUpdate" , vo);
	}

	@Override
	public void boardDelete(Integer bno) throws Exception {
		session.delete(namespace + ".boardDelete" , bno);
	}

	@Override
	public List<BoardVO> boardList() throws Exception {
		return session.selectList(namespace + ".boardList");
	}

}
