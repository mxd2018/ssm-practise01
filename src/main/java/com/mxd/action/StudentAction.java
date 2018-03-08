package com.mxd.action;

import com.mxd.pojo.po.PageBean;
import com.mxd.pojo.po.Student;
import com.mxd.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentAction {
	@Autowired
	private IStudentService service;
	
	@RequestMapping("/regist")
	public String registAction(){
		return "regist";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student){
		service.addStudent(student);
		return "index2";
	}
	
	@RequestMapping("/listAllStudent/{currentPage}")
	public String listAllStudent(@PathVariable(value="currentPage")int currentPage, HttpSession session){
		
		int countOfonePage = 2;
		int studentNumber = service.findStudentNumber();
		int totalPage = (int) Math.ceil(studentNumber/(countOfonePage*1.0));
		int productIndex = (currentPage-1)*countOfonePage;
		
		PageBean pageBean = new PageBean(currentPage, countOfonePage, studentNumber, totalPage, productIndex);

		session.setAttribute("pageBean", pageBean);
		
		List<Student> students = service.selectAllStudent(pageBean);
		session.setAttribute("students", students);
		
		return "student_list";
	}

	@RequestMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value="id")Integer id){
		service.deleteStudentById(id);

		return "redirect:/student/listAllStudent/1";

	}
}
