package com.example.reflect.demo;

public class Story {
	
	private int mStoryNumber;
	private String mStoryAuthor;
	
	
	public int getmStoryNumber() {
		return mStoryNumber;
	}

	private void setmStoryNumber(int mStoryNumber) {
		this.mStoryNumber = mStoryNumber;
	}

	public String getmStoryAuthor() {
		return mStoryAuthor;
	}

	public void setmStoryAuthor(String mStoryAuthor) {
		this.mStoryAuthor = mStoryAuthor;
	}

	public void printData() {
		System.out.println("private method:"+mStoryNumber);
	}
}
