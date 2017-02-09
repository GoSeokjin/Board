import java.awt.List;
import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.dao.BoardDaoImpl;
import com.board.service.BoardServiceImpl;
import com.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class JDBCTest {

	@Inject
	private BoardDaoImpl dao;
	
	@Test
	public void test()throws Exception{
		java.util.List<BoardVO> vo = dao.listPage(3);
		
		for(BoardVO boardvo : vo){
			System.out.println(boardvo.getBtitle());
		}
	}
	
}
