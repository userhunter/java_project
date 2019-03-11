package com.example.demo.sort;

public class BummbleSort {
	
	public static void bummbleSort(int a[],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(a[j-1]>=a[j]) {
					// 直接使用当前的swap方法交换数据，不生效
//				    swap(a[j-1], a[j]);  
					int temp;
					temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		PrintData.print(a);
	}
	
	public static void swap(int a,int b) {
		int temp;
		temp = a;
		a=b;
		b=temp;
	}
	
}
