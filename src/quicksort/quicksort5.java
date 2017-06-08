package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quicksort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrlist = new ArrayList<>();
		while(sc.hasNextInt()){
			arrlist.add(sc.nextInt());
		}
		sc.close();
		arrlist.trimToSize();
		int[] arr = new int[arrlist.size()];
		for(int i=0;i<arrlist.size();i++){
			arr[i] = arrlist.get(i);
		}
		
		quick_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quick_sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int l = low;
		int h = high;
		int flag = arr[low];
		
		while(l<h){
			while(l<h&&arr[h]>=flag)h--;
			if(l<h){
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}
			while(l<h&&arr[l]<=flag)l++;
			if(l<h){
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
			if(l>low)quick_sort(arr,low,l-1);
			if(h<high)quick_sort(arr,h+1,high);
		}
	}

}
