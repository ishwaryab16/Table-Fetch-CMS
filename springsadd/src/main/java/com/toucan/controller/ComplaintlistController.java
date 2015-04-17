package com.toucan.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.toucan.model.Appfeedback;
import com.toucan.model.Complaintlist;
import com.toucan.model.ComplaintsView;
import com.toucan.service.AppfeedbackServ;
import com.toucan.service.ComplaintlistServ;
import com.toucan.service.ComplaintsViewServ;

@SuppressWarnings("unused")
@Controller
public class ComplaintlistController {

	@Autowired
	private ComplaintlistServ complaintService;
	@Autowired
	private ComplaintsViewServ cServ;
	
	@RequestMapping("/indexComp")
	public String setupForm(Map<String, Object> map) {
//		Complaintlist comp = new Complaintlist();
//		Appfeedback app = new Appfeedback();
		ComplaintsView cview = new ComplaintsView();
		map.put("student1", cview);
		map.put("studentList", cServ.getAll());
//		map.put("studentList", appServ.getAll());
//		String a = comp.getPriority().toString();
//		for(int i = 0 ; i< a.length(); i++)
//		{
//			System.out.println("loop1 " + a);
//		}
//		for (String key : map.keySet()) {
//			System.out.println("res" + key + " " + map.get("studentList"));
//		}
//		System.out.println("compl " + map.get("studentList"));
		return "studentoutput";
	}

	@RequestMapping("/welcome1")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hello World, Spring MVC Tutorial</h3>This message is coming from vatsa controller </div><br><br>";
		return new ModelAndView("welcome1", "mess", message);
	}

	@RequestMapping(value = "/complaintlist.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Complaintlist comp,
			BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Complaintlist comp1 = new Complaintlist();

		map.put("student1", comp1);
		map.put("studentList", complaintService.getAll());
		return "studentoutput";
	}
}
