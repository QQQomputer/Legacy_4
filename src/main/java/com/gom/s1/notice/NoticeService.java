package com.gom.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	
	
	//list
	public List<NoticeDTO> list() throws Exception{		
		List<NoticeDTO> ar = noticeDAO.list();				
		return ar;
	}
	
}
