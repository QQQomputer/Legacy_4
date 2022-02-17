package com.gom.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gom.s1.MyJunitTest;

public class BankBookDAOTest extends MyJunitTest {

	@Autowired
	private BankBookDAO bankBookDAO;

	@Test
	public void check() {
		assertNotNull(bankBookDAO);
	}
	
	@Test
	public void listTest() throws Exception{
		List<BankBookDTO> ar = bankBookDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	//@Test
	public void addTest() throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("t2");
		bankBookDTO.setBookContents("c2");
		bankBookDTO.setBookRate(3.12);
		bankBookDTO.setBookSale(1);
		int result = bankBookDAO.add(bankBookDTO);
		assertEquals(1, result);
	}
	
//	@Test
//	public void detailTest() throws Exception {
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		bankBookDTO.setBookNumber(2L);
//		bankBookDTO = bankBookDAO.detail(bankBookDTO);
//		assertNotNull(bankBookDTO);
//	}
	@Test
	public void detailTest() throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO = bankBookDAO.detail(2L);
		assertNotNull(bankBookDTO);
	}	
	
	
}
