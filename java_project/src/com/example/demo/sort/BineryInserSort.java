package com.example.demo.sort;

public class BineryInserSort {
	
	
	public static int binarySearch(int a[] , int i) {
		int mid = -1;
		int low = 0;
		int high = i-1;
		while (low <= high) {
			mid = (low + high)/2;
			if(a[mid]>a[i]) {
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		
		return low;
	}
	
	public static void binarySort(int a[]) {
		
		int length = a.length;
		for(int i=1;i<length;i++) {
			int k = binarySearch(a, i);
			int key = a[i];
			for(int j=i-1;j>=k;j--) {
				a[j+1] =a[j];
			}
			a[k]=key;
		}
		
		PrintData.print(a);
	}

}
