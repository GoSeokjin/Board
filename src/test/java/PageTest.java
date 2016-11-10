import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.controller.BoardController;
import com.board.dao.BoardDaoImpl;
import com.board.vo.BoardVO;
import com.board.vo.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PageTest {

	@Inject
	private BoardDaoImpl dao;

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	@Test
	public void test()throws Exception{
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);
		
		List<BoardVO> list = dao.boardCriteria(cri);
		
		for(BoardVO vo : list){
			logger.info(vo.getBno() + ":" + vo.getTitle());
		}
	}
	
}
