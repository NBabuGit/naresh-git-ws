package com.learn.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {6,8,1,4,5,3,7,2};
		quickSort(list, 0, 7);
		System.out.println(Arrays.toString(list));

	}
	
	public static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	private static int partition(int[] arr, int low, int high){
		int pivotValue = arr[low];
		int left = low;
		int right = high;
		
		while(left <right){
			while(arr[left] <= pivotValue){
				left++;
			}
			
			while(arr[right] > pivotValue){
				right--;
			}
			
			if(left <right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		arr[low] = arr[right];
		arr[right]= pivotValue;
		return right;
	}

}
