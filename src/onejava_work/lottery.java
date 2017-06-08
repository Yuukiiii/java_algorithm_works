package onejava_work;

import java.util.Arrays;

/**
 * 
 * @author Yuukiiii
 * @version 1.0
 * This program is used to choose 100 numbers from 1 to 10000,
 * and these 100 numbers are different from each other.
 */
public class lottery {
	
	private static final int LOTTERYPOOL = 10; 
	private static final int COUNT = 1;
	private static final int START = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] huge = new int[LOTTERYPOOL];//抽签池
		for(int i=0;i<LOTTERYPOOL;i++){
			huge[i] = i+START;
		}
		//充满抽签池，注意起点都是0，具体的值是i+START来的
		int length = LOTTERYPOOL;
		int[] chosen = new int[COUNT];
		for(int j = 0;j<COUNT;j++){
			int chosenPos = (int) (Math.random()*length);
			chosen[j] = huge[chosenPos];
			int m = huge[length-1];
			huge[length-1] = huge[chosenPos];
			huge[chosenPos] = m;
			length--;
		}
		//将被抽取的数放到数组最后面 然后缩小一个抽取范围 这样就不重复了
		System.out.println(Arrays.toString(chosen));
	}

}
