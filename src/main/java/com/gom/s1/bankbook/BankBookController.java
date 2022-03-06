package com.gom.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gom.s1.util.Pager;

@Controller
@RequestMapping("/bankbook/*")//** 2개 하면 오류
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(BankBookDTO bankBookDTO) throws Exception {
		int result = bankBookService.update(bankBookDTO);
		return "redirect: ./list";
	}
		
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO, Model model) throws Exception {
		bankBookDTO = bankBookService.detail(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
	}
	
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(BankBookDTO bankBookDTO, Model model) throws Exception{
		int result = bankBookService.delete(bankBookDTO);

		if(result !=0) {
			model.addAttribute("message", "삭제 성공");
		}else {
			model.addAttribute("message", "삭제 실패");			
		}
		model.addAttribute("path", "bankbook/list");
		return "common/result";
	}
	
	
	//insert DB
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(BankBookDTO bankBookDTO, String [] ch) throws Exception{
		int result = bankBookService.add(bankBookDTO);	
		return "redirect:./list";
	}
	
	//insert form 이동
	@RequestMapping(value = "add", method=RequestMethod.GET)
	public void add()throws Exception{

	}
	
	
	//detail
	@RequestMapping(value = "detail", method =RequestMethod.GET)
	public String detail(BankBookDTO bankBookDTO, Model model) throws Exception {
		bankBookDTO = bankBookService.detail(bankBookDTO);

		String view = "common/result";
		
		if(bankBookDTO != null) {
			view = "bankbook/detail";
			model.addAttribute("dto", bankBookDTO);
		}else {
			model.addAttribute("message", "없는 번호입니다.");
			model.addAttribute("path", "./list");
		}

		return view;

	}
	
	
	//list
	@RequestMapping(value="list", method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mv, Pager pager) throws Exception {////
		//ModelAndView modelAndView = new ModelAndView();
		List<BankBookDTO> ar = bankBookService.list(pager);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("bankbook/list");
		return mv;
		
	}
	
}
