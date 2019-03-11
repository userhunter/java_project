package com.example.data.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapUtils {
	
	public static void testLinkHashmap() {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(0, 0.75f, true);
	    map.put(0, 0);
	    map.put(1, 1);
	    map.put(2, 2);
	    map.put(3, 3);
	    map.put(4, 4);
	    map.put(5, 5);
	    map.put(6, 6);
	    map.get(1);     //访问1
	    map.get(2);     //访问2

	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}

}
