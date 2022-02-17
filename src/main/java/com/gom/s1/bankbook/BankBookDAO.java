package com.gom.s1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.gom.s1.bankbook.BankBookDAO.";
	
	//list
	public List<BankBookDTO> list() throws Exception {
		String name="";
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	//insert
	public int add(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", bankBookDTO);
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
	
	
	
}
