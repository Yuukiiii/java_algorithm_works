package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yuukiiii
 * 原理是每次递归选择出排列中最中间的那个
 * 第一轮先选第一个作为flag，然后先从后向前找变比他小的，再从前向后找比他大的，与他交换 
 * 使得变换后flag前的都比他小，后的都比他大
 *
 *
 *1.必须在一个数组内完成，即函数的数组参数永远是一开始的数组，递归时只能处理数组的部分而不是重新
 *	建立一个新的数组，这一操作由low和l-- high和h++控制，每一次的flag不参与下一次递归
 *2.循环判断的关键是l和h是否相等了，只要不相等，他们之间就有操作的空间，就可以进行数值交换或者
 *	进行下一次递归
 *3.每一次交换完数值，就要把l++ 或者 h-- 这是保证flag不参与下次判定或递归的标志
 */
public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrlist = new ArrayList<>();
		while(sc.hasNextInt()){
			arrlist.add(sc.nextInt());
		}
		arrlist.trimToSize();
		int[] arr = new int[arrlist.size()];
		for(int i=0;i<arr.length;i++){
			arr[i] = arrlist.get(i);
		}
		quick_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}



	private static void quick_sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int l=low;
		int h=high;
		int povit=arr[low];
	
		while(l<h){
			while(l<h&&arr[h]>=povit)h--;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				l++;
			}
			System.out.println(Arrays.toString(arr)+" "+arr[l]+" "+arr[h]);
			while(l<h&&arr[l]<=povit)l++;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				h--;
			}
			System.out.println(Arrays.toString(arr)+" "+arr[l]+" "+arr[h]);
		}
		System.out.println(Arrays.toString(arr)+" "+arr[l]+" "+arr[h]);
		if(l>low)quick_sort(arr,low,l-1);
		if(h<high)quick_sort(arr,l+1,high);
	}
}


