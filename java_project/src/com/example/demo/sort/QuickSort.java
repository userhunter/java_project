package com.example.demo.sort;

public class QuickSort {
	
	
	public static int partition(int a[],int low,int high) {
		
		int key = a[low];
		while(low < high) {
			
			while (a[high]>=key && high > low) {
				high--;
			}
			a[low] = a[high];
			
			while (a[low]<=key && high > low) {
				low++;
			}
			
			a[high]=a[low];
		}
		
		a[high] = key;
		
		return high;
		
	}
	
	public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }

}
