package com.example.reflect.demo;

import java.lang.reflect.Method;

public class StoryReflect {
	
	public static void getStoryData() throws ClassNotFoundException {
		
		Class storyClass = Class.forName("com.example.reflect.demo.Story");
		try {
			Method method = storyClass.getDeclaredMethod("setmStoryNumber", int.class);
			method.setAccessible(true);
			
			Story story = (Story) storyClass.newInstance();
			method.invoke(story, 100);
			
			story.printData();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
