package com.exam.exam_system.common;

/**
 * 
 * @ClassName: PageRequest
 * @Description:
 * @author:
 * @date: 2020/3/22 13:15
 * @version : V1.0
 */
public class PageRequest<T> {
	/**
	 * 当前页码
	 */
	private Integer pageNo;
	/**
	 * 每页数据量
	 */
	private Integer pageSize;
	/**
	 * 具体请求对象
	 */
	private T obj;

	/**
	 * 计算偏移量
	 * 
	 * @return 偏移量
	 */
	public int getOffset() {
		return (pageNo - 1) * pageSize;
	}

	/**
	 * 计算limit大小
	 * 
	 * @return limit大小
	 */
	public int getLimit() {
		return pageSize;
	}

	// get&set
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
