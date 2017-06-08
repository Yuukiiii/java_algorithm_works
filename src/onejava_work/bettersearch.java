package onejava_work;
/**
 * 
 * @author Yuukiiii
 *
 */
public class bettersearch {
	private static final int NUM = 11;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();   //获取开始时间  
		int[] arr = {1,4,5,9,11,13,15,20,30,44,65};
		int head = 0;
		int foot = (arr.length)-1;
		boolean flag = false;
		while(head<=foot){
			int middle = head+(NUM-arr[head])/(arr[foot]-arr[head])*(foot-head);
			if(NUM==arr[middle]){
				System.out.println(middle);
				flag=true;
				break;
			}else if(arr[middle]>NUM){
				foot = middle-1;
			}else{
				head = middle+1;
			}
		}
		if(flag==false)System.out.println("NOT FOUND !");
		long endTime=System.nanoTime(); //获取结束时间  
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
}
