/**
 * 
 */
package com.toucan.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.toucan.model.Student;
import com.toucan.service.StudentService;

/**
 * @author MavJay
 *
 */
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Student student = new Student();
		map.put("student1", student);
		map.put("studentList", studentService.getAllStudents());
		return "studentoutput";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hello World, Spring MVC Tutorial</h3>This message is coming from vatsa controller </div><br><br>";
		return new ModelAndView("welcome", "mess", message);
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions (@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Student studentRes = new Student();
		if(action.toLowerCase().equals("add")){
			studentService.addStudent(student);
			studentRes = student;
		}
		
		if(action.toLowerCase().equals("edit")){
			studentService.editStudent(student);
			studentRes = student;
		}
		map.put("student1", studentRes);
		map.put("studentList", studentService.getAllStudents());
		return "studentoutput";
	}
}
