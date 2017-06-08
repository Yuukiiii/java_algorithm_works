package quicksort;
/**
 * @author Yuukiiii
 * 
 * 原理是每次递归选择出排列中最中间的那个
 * 第一轮先选第一个作为flag，然后先从后向前找变比他小的，与他交换，再从前向后找比他大的，与他交换 
 * 使得变换后flag前的都比他小，后的都比他大,再对被分成两块的数组做递归操作
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quicksort2 {

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
		int l = low;
		int h = high;
		int flag = arr[low];
		
		while(l<h){
			while(l<h&&arr[h]>=flag)h--;
			if(l<h){
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
			}
			while(l<h&&arr[l]<=flag)l++;
			if(l<h){
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
		if(l>low)quick_sort(arr,low,l-1);
		if(h<high)quick_sort(arr,l+1,high);
	}

}

