package ch5;

import java.util.Arrays;

class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;
		
		
		
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
		
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i < arr.length;i++) 
			tmp[i] = arr[i];
		
		System.out.println(Arrays.toString(tmp));
		
		arr = tmp;  
		
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
	}
}
