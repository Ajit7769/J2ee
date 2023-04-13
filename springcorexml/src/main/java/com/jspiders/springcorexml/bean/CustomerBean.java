package com.jspiders.springcorexml.bean;

import java.util.List;

import lombok.Data;

@Data
public class CustomerBean {

	private int id;
	private String name;
	private String city;
	private long mobile_no;
	List<ProductBean> product;
	
}
