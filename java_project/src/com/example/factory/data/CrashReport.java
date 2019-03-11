package com.example.factory.data;

public class CrashReport implements DataReport{

	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("CrashReport report");
		
	}

	@Override
	public void callback() {
		// TODO Auto-generated method stub
		System.out.println("CrashReport callback");
		
	}

}
