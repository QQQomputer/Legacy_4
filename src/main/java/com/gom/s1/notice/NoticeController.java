package com.gom.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gom.s1.bankbook.BankBookDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(NoticeDTO noticeDTO) throws Exception{
		int result = noticeService.update(noticeDTO);
		String str = "redirect:./detail?num="+noticeDTO.getNum();
		System.out.println(str);
		return str;
	}
	
	@RequestMapping(value="update", method = RequestMethod.GET)
	public void update(NoticeDTO noticeDTO, Model model) throws Exception{
		noticeDTO = noticeService.detail(noticeDTO);
		model.addAttribute("dto", noticeDTO);
	}
	
	@RequestMapping(value = "add", method=RequestMethod.POST)
	public ModelAndView add(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.add(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	
	@RequestMapping(value = "add", method=RequestMethod.GET)
	public ModelAndView add()throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("notice/add");
		return mv;
	}
	
	
	@RequestMapping(value = "detail", method=RequestMethod.GET)
	public ModelAndView detail(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.detail(noticeDTO);
		mv.addObject("dto", noticeDTO);
		mv.setViewName("notice/detail");
		return mv;
	}
	
	
	@RequestMapping(value = "list", method=RequestMethod.GET)
	public ModelAndView list()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		ModelAndView mv = new ModelAndView();
		List<NoticeDTO> ar = noticeService.list(noticeDTO);
		mv.addObject("list", ar);
		mv.setViewName("notice/list");
		return mv;
	}

}
