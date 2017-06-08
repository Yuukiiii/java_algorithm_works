package onejava_work;
/**
 * @author Yuukiiii
 * 输入n， 求y1=1!+3!+...m!(m是小于等于n的最大奇数） y2=2!+4!+...p!(p是小于等于n的最大偶数)。 
 * 
 */
import java.util.Scanner;

public class jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        int y1=0,y2=0;
		int key=1;
        for(int i=1;i<=n;i++){
        	key*=i;
            if(i%2==1){
                y1+=key;
            }else{
                y2+=key;
            }
        }
        System.out.println("y1 = "+y1);
        System.out.println("y2 = "+y2);
	}

}
