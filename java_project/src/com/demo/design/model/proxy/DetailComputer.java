package com.demo.design.model.proxy;

public class DetailComputer implements IComputer{

	@Override
	public void buyCpu(String type) {
		System.out.println("buy intel cpu."+type);
	}
}
