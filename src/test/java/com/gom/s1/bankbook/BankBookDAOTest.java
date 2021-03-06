package com.gom.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gom.s1.MyJunitTest;
import com.gom.s1.util.Pager;

public class BankBookDAOTest extends MyJunitTest {

	@Autowired
	private BankBookDAO bankBookDAO;

	//@Test
	public void check() {
		assertNotNull(bankBookDAO);
	}
	
	@Test
	public void listTest() throws Exception{
		Pager pager = new Pager();
		pager.setPerPage(5L);
		pager.makeRow();
		List<BankBookDTO> ar = bankBookDAO.list(pager);
		System.out.println(ar.get(0).getBookNumber());
		System.out.println(ar.get(4).getBookNumber());
		assertEquals(5, ar.size());
	}
	
	//@Test
	public void addTest() throws Exception {
		
		for(int i=0; i<200;i++) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("bookName"+i);
			bankBookDTO.setBookContents("Contents"+i);
			
			double rate = Math.random();
			int r = (int)(rate*1000);
			rate = r/100.0;
			
			
			bankBookDTO.setBookRate(rate);
			bankBookDTO.setBookSale(1);
			int result = bankBookDAO.add(bankBookDTO);
			
			if(i%10==0) {
				Thread.sleep(1000);
			}
			
		}
		
		
		
		
		
		System.out.println("add테스트");
		
		//assertEquals(1, result);
	}
	
	//detail
	//@Test
	public void detailTest() throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(2L);
		bankBookDTO = bankBookDAO.detail(bankBookDTO);
		assertNotNull(bankBookDTO);
	}
//	@Test
//	public void detailTest() throws Exception {
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		bankBookDTO = bankBookDAO.detail(2L);
//		assertNotNull(bankBookDTO);
//	}	
	
	//@Test
	public void deleteTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(3L);
		int result = bankBookDAO.delete(bankBookDTO);
		assertEquals(1, result);
	}
	
	
}