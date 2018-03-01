package com.mxd.service;

import com.mxd.pojo.po.PageBean;
import com.mxd.pojo.po.Student;

import java.util.List;

public interface IStudentService {
	public void addStudent(Student student);
	
	public void deleteStudentById(Integer id);
	
	public void updateStudent(Student student);
	
	public Student selectStudentById(Integer id);
	
	public List<Student> selectAllStudent(PageBean pageBean);
	
	public int findStudentNumber();
	
}
