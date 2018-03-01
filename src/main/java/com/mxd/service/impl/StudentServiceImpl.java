package com.mxd.service.impl;

import com.mxd.dao.IStudentDao;
import com.mxd.pojo.po.PageBean;
import com.mxd.pojo.po.Student;
import com.mxd.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private IStudentDao dao;
	
	@Override
	public void addStudent(Student student) {
		dao.addStudent(student);
		
	}


	@Override
	public void deleteStudentById(Integer id) {
		dao.deleteStudentById(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public Student selectStudentById(Integer id) {
		return dao.selectStudentById(id);
	}

	@Override
	public List<Student> selectAllStudent(PageBean pageBean) {
		
		return dao.selectAllStudent(pageBean);
	}

	@Override
	public int findStudentNumber() {
		
		return dao.findStudentNumber();
	}

}
