package onejava_work;
/**
 * @author Yuukiiii
 * java除法是去尾整除
 */
import java.util.Scanner;

public class njinzhi {
	private static final int JINZHI = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number : ");
        int num = sc.nextInt();
        sc.close();
        String str = "";
        if(num==0)System.out.println(0);
        while(num!=0){
            int i = num%JINZHI;
            str = i+str;
            num/=JINZHI;
        }
        System.out.println(str);
	}

}
