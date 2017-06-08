package onejava_work;
/**
 * 
 * @author Yuukiiii
 */
import java.util.ArrayList;
import java.util.Scanner;

public class maopaopaixu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		while(sc.hasNextInt()){
			arr.add(sc.nextInt());
		}
		for(int i=0;i<arr.size();i++){
			boolean flag = false;
			for(int j=i+1;j<arr.size();j++){
				if(arr.get(i)>arr.get(j)){
					int t = arr.get(i);
					arr.set(i,arr.get(j));
					arr.set(j,t);
					flag = true;
				}
				
			}
			if(!flag)break;
		}
		//arr.get(arr.size());
		
		for(int j :arr)
			System.out.println(j);

		sc.close();
	}

}
