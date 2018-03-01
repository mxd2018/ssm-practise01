package com.mxd.dao;


import com.mxd.pojo.po.PageBean;
import com.mxd.pojo.po.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStudentDao {
	public void addStudent(Student s);
	
	public void deleteStudentById(Integer id);
	
	public void updateStudent(Student s);
	
	public Student selectStudentById(Integer id);
	
	public List<Student> selectAllStudent(PageBean pageBean);
	
	public int findStudentNumber();
}
