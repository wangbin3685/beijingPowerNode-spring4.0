package com.bjpowernode.aop11;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst");
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond");
		return "abcd";
	}

}
