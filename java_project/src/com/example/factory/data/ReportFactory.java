package com.example.factory.data;

public class ReportFactory {
	
	public static DataReport getInstance(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (DataReport) Class.forName(name).newInstance();
	}

}
