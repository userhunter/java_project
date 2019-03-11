package com.example.data.utils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class UtilsDataTest {
	
	public static void testMD5() {
		String url = "http://hao123.com";
		
		System.out.println(url);
		
		String encodeFirst = null;
		encodeFirst = Md5FileNameGenerator.generate(url);
		System.out.println("after md5 encryption:"+encodeFirst);
		
		String encodeSecond;
		String encodeThird;
		try {
			encodeSecond = Md5FileNameGenerator.encode(url);
			System.out.println("after md5 encryption:"+encodeSecond);
			if(encodeFirst.equals(encodeSecond)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			
			encodeThird = SHAUtils.encodeFromSHA(url);
			System.out.println("SHA encode:"+encodeThird);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
