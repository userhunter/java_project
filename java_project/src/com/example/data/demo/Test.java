package com.example.data.demo;

import java.util.ArrayList;

import com.demo.design.model.proxy.ProxyTest;
import com.demo.designmodel.builder.DataBuilder;
import com.example.data.utils.HashMapUtils;
import com.example.data.utils.UtilsDataTest;
import com.example.demo.sort.BineryInserSort;
import com.example.demo.sort.BummbleSort;
import com.example.demo.sort.PrintData;
import com.example.demo.sort.QuickSort;
import com.example.designmodel.decorate.Animal;
import com.example.designmodel.decorate.Fish;
import com.example.designmodel.decorate.HigherAnimal;
import com.example.designmodel.decorate.Monkey;
import com.example.designmodel.decorate.People;
import com.example.factory.data.CrashReport;
import com.example.factory.data.DataReport;
import com.example.factory.data.ReportFactory;
import com.example.reflect.demo.StoryReflect;
import com.sun.org.apache.bcel.internal.generic.StackInstruction;

public class Test {
	
	private static int NeedSortdata[] = {6,4,1,3,2};

	public static void main(String[] args) {
//		test();
//		testBuikder();
//		setTestAnimal();
		
//		try {
//			testFactory();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			StoryReflect.getStoryData();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		ProxyTest.test();
//		UtilsDataTest.testMD5();
//		HashMapUtils.testLinkHashmap();
		      
//		testClassLoader();
		
//		testSort();
//		startData("abc","def");
		BineryInserSort.binarySort(NeedSortdata);
		
	}
	
	private static void startData(String ... strings ) {
		
		for(String s:strings) {
			System.out.println(s);
		}
		
	}
	
	private static void testSort() {
		
//		QuickSort.sort(NeedSortdata, 0, NeedSortdata.length -1 );
		BummbleSort.bummbleSort(NeedSortdata, NeedSortdata.length -1);
		
//		print(NeedSortdata);
	}
	
	private static void print(int sort[]) {
		for(int a:sort) {
			System.out.println(a);
		}
	}
	
	private static void testClassLoader() {
		ClassLoader classLoader = Test.class.getClassLoader();
		System.out.println(""+classLoader);
		System.out.println(""+classLoader.getParent());
		System.out.println(""+classLoader.getParent().getParent());
		
		System.out.println(""+classLoader.getSystemClassLoader());
	}
	
	
	private static void testFactory() throws Throwable {
		
		long startTime = System.currentTimeMillis();
		DataReport dataReport = ReportFactory.getInstance("com.example.factory.data.CrashReport");
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		long startTimeSecond = System.currentTimeMillis();
		DataReport dataReportSecond = new CrashReport();
		long endTimeSecond = System.currentTimeMillis();
		System.out.println(endTimeSecond - startTimeSecond);
		
		dataReport.report();
		dataReport.callback();
	}
	
	private static void setTestAnimal() {
		Animal animal = new Fish();
		Animal higherAnimal = new HigherAnimal(animal);
		Animal people = new People(animal);
		people.eat();
		people.drink();
		
		System.out.println("--------------------------");
		
		Animal monkey = new Monkey(animal);
		monkey.drink();
	}
	
	private static void test() {
		ArrayList<Integer> arrayList = null;
		
		if(arrayList != null && arrayList.size() > 0) {
			System.out.println("OK");
		} 
		
		System.out.println("next");
	}
	
	private static void startData() {
		System.out.println("xianzai jiushi zheli.");
	}
	
	private static void testBuikder() {
		DataBuilder data = new DataBuilder.Builder().setDataKey("A", "hello").setDataKey("B", "niubi").create();
		data.sendData();
	}

}
