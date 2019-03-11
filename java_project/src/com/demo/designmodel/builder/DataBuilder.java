package com.demo.designmodel.builder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class DataBuilder {
	
	private static HashMap<String, String> mHashMap = null;
	
	public static class Builder{
		private HashMap<String, String> map = new HashMap<>();
		public Builder setDataKey(String key,String value) {
			map.put(key, value);
			return this;
		}
		
		public  DataBuilder create() {
			return new DataBuilder(this);
		}
	}
	
	private DataBuilder(Builder builder) {
		mHashMap = builder.map;
	}
	
	public static void sendData() {
		
		//  send 
		System.out.println("send the hashmap:"+mHashMap);
		Iterator iter = mHashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry) iter.next();
			System.out.println("key:"+entry.getKey());
		}
	}

}
