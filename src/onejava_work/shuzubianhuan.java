package onejava_work;
/**
 * 牛牛有一个数组，里面的数可能不相等，现在他想把数组变为：所有的数都相等。问是否可行。
 * 牛牛可以进行的操作是：将数组中的任意一个数改为这个数的两倍。
 * 这个操作的使用次数不限，也可以不使用，并且可以对同一个位置使用多次。
 * 
 * 输入一个正整数N (N <= 50) 接下来一行输入N个正整数，每个数均小于等于1e9.e.g  2 /n 1 2
 * 
 * 假如经过若干次操作可以使得N个数都相等，那么输出"YES", 否则输出"NO" e.g YES
 * 
 * 学到了如何求对数 用Math.log和换底公式 log方法只能计算以自然对数为底的对数 Math.log(value) / Math.log(base) 换底公式可以算任意的对数
 * 
 * 学到了判断一个数是否是整数 先强制类型转换 再求差 如果不为0 就不是整数
 */
import java.util.ArrayList;
import java.util.Scanner;

public class shuzubianhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		Integer min = Integer.MAX_VALUE;
				
		for(int i : arr){
			if(min>i)
				min=i;
		}
		for(int i : arr){
			float t = (float)i/min;
			double d = Math.log(t) / Math.log(2);
			if((d-(int)d)!=0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}

}
