package onejava_work;
/**
 * 
 * @author Yuukiiii
 * 
 */
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while(!str.equals("exit")){
			char[] ch = str.toCharArray();
			String str2 ="";
			for(int i=ch.length-1;i>=0;i--){
				str2+=ch[i];
			}
			if(str2.equals(str)){
				System.out.println("It's palindrome !");
			}else{
				System.out.println("It's not palindrome !");
			}
			System.out.print("Please enter the string : ");
			str = sc.nextLine();
		}
		sc.close();
	}
	//另一种方式是用String的charAt方法。用charAt方法既可以构造一个新的String来比较
	//也可以直接在String上比较，用头符号比尾符号，然后头指针++，尾指针-- 保证头小于尾亦可
}
