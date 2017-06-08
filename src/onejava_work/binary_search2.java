package onejava_work;

public class binary_search2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,9,11,13,15,20,30,44,65};
		int num = 13;
		int answer=-1;
		int low = 0,high = arr.length-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(num==arr[mid]){
				answer = mid;
				break;
			}else if(num>arr[mid]){
				low = mid;
			}else{
				high = mid;
			}
		}
		if(answer!=-1)
			System.out.println(answer);
		else
			System.out.println("Not Found !");
	}

}
