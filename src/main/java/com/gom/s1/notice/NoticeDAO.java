package com.gom.s1.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gom.s1.bankbook.BankBookDTO;


@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.gom.s1.notice.NoticeDAO.";
			
	public List<NoticeDTO> list() throws Exception {		
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	
	
}
