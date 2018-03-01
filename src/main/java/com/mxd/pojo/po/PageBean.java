package com.mxd.pojo.po;

public class PageBean {
	private Integer currentPage;
	private Integer countOfonePage;
	private Integer studentNumber;
	private Integer totalPage;
	private Integer productIndex;
	
	
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PageBean(Integer currentPage, Integer countOfonePage, Integer studentNumber, Integer totalPage,
			Integer productIndex) {
		super();
		this.currentPage = currentPage;
		this.countOfonePage = countOfonePage;
		this.studentNumber = studentNumber;
		this.totalPage = totalPage;
		this.productIndex = productIndex;
	}


	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getCountOfonePage() {
		return countOfonePage;
	}
	public void setCountOfonePage(Integer countOfonePage) {
		this.countOfonePage = countOfonePage;
	}
	public Integer getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getProductIndex() {
		return productIndex;
	}
	public void setProductIndex(Integer productIndex) {
		this.productIndex = productIndex;
	}
	
	
}
