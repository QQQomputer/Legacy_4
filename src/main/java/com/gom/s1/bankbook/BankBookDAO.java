package com.gom.s1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gom.s1.util.Pager;

@Repository
public class BankBookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.gom.s1.bankbook.BankBookDAO.";
	
	//list
	public List<BankBookDTO> list(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE+"list", pager);
	}
	
	//insert
	public int add(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", bankBookDTO);
	}
	
	//total
	public Long total(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"total", pager);
	}
	
	//detail
	public BankBookDTO detail(BankBookDTO bankBookDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", bankBookDTO);
	}
	public BankBookDTO detail(Long num) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", num);
	}
	
	//delete
	public int delete(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", bankBookDTO);
	}
	//update
	public int update(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update", bankBookDTO);
	}
	
	
}
