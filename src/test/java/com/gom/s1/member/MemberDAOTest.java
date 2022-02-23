package com.gom.s1.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gom.s1.MyJunitTest;

public class MemberDAOTest extends MyJunitTest {

	@Autowired
	private MemberDAO memberDAO;
	
	//@Test
	public void JoinTest() throws Exception {
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id2");
		memberDTO.setPw("pw2");
		memberDTO.setName("name2");
		memberDTO.setPhone("010-2222-2222");
		memberDTO.setEmail("id2@gmail.com");
		int result = memberDAO.join(memberDTO);

		assertEquals(1, result);
	}
	
	//@Test
	public void LoginTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id2");
		memberDTO.setPw("pw2");
		memberDTO = memberDAO.login(memberDTO);
		
		assertNotNull(memberDTO);
	}
	
	@Test
	public void mypageTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id34");
		memberDTO = memberDAO.mypage(memberDTO);
		assertNotNull(memberDTO);
	}
	
	
	

}
