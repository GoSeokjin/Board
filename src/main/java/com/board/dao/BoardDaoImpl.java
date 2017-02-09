package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.vo.BoardVO;
import com.board.vo.Criteria;


@Repository
public class BoardDaoImpl implements BoardDaoIn{
	
    @Inject
    private SqlSession session;
    
    private static String namespace = "com.project.mapper.boardMapper";
	
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

	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		if(page <= 0){
			page = 1;
		}
		page = (page-1) * 10;
		return session.selectList(namespace+".listpage" , page);
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception{ 
		return session.selectList(namespace+".listCriteria",cri);
	}

	@Override
	public int countPagin(Criteria cri) throws Exception {
		return session.selectOne(namespace+".countPaging" , cri);
	}

	


}
