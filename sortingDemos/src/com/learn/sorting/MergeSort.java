package com.learn.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {6,8,1,4,5,3,7,2};
		mergesort(list, new int[list.length], 0, 7);

	}
	
	public static void mergesort(int[] arr, int[] temp, int leftStart, int rightEnd){
		if(leftStart >= rightEnd){
			return;
		}
		
			int mid = (leftStart + rightEnd) /2;
			mergesort(arr, temp, leftStart, mid);
			mergesort(arr, temp, mid+1, rightEnd);
			merge(arr, temp, leftStart, rightEnd);
		
	}
	
	public static void merge(int[] arr, int[] temp, int leftStart, int rightEnd){
		System.out.println("leftStart:"+leftStart+":rightEnd:"+rightEnd);
		int leftEnd = (leftStart + rightEnd) /2;
		int rightStart = leftEnd+1;
		int size = rightEnd - leftStart+1;
		
		int left =leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(arr[left] < arr[right]){
				temp[index] = arr[left];
				left++;
			}else{
				temp[index] = arr[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
		System.out.println("temp:::"+Arrays.toString(temp));
		System.out.println("arr::"+Arrays.toString(arr));
	}

}
