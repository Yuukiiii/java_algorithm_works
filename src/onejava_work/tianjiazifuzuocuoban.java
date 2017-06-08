package onejava_work;

import java.util.Scanner;

/**
 * 
 * @author Yuukiiii
 * 牛牛手里有一个字符串A，羊羊的手里有一个字符串B，B的长度大于等于A，所以牛牛想把A串变得和B串一样长，这样羊羊就愿意和牛牛一起玩了。
 * 而且A的长度增加到和B串一样长的时候，对应的每一位相等的越多，羊羊就越喜欢。比如"abc"和"abd"对应相等的位数为2，为前两位。
 * 牛牛可以在A的开头或者结尾添加任意字符，使得长度和B一样。现在问牛牛对A串添加完字符之后，不相等的位数最少有多少位？
 * 
 * 第一行为字符串A，第二行为字符串B，A的长度小于等于B的长度，B的长度小于等于50.字符均为小写字母。 e.g abe  cabc
 * 输出一个整数表示A串添加完字符之后，不相等的位数最少有多少位？ e.g 1
 * 
 * 实际上 我这个题思路有问题 做成了用一个短的字符字符串和长的字符串比，短的字符串长度减去短的和长的的交集字符串的长度
 */
public class tianjiazifuzuocuoban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//接受字符串
		//判断b长度是否大于a
		//看a是否是b的字串 若不是 去掉一个字符比较 若不是去掉两个。或者去掉三个
		//设置头和尾，一开始先把头设为当前要去掉的所有字符数量而结尾为0，然后头--尾++知道头变成0 
		//然后在把要去掉的字符-1
		//只要满足了条件 直接return
		Scanner sc = new Scanner(System.in);
		String stra = sc.nextLine();
		String strb = sc.nextLine();
		System.out.println(stra+ " "+strb);
		if(stra.length()>strb.length()){
			System.out.println("strings are wrong ! ");
			return;
		}
		//StringBuffer strbfra = new StringBuffer(stra);
		
		for(int minus = 0;;minus++){
			int head = 0,foot = 0;
			for(head = minus;head>=0;head--,foot++){
				StringBuffer sba2 = new StringBuffer(stra);
				for(int i=0;i<head;i++){
					sba2=sba2.deleteCharAt(0);
				}
				for(int j=0;j<foot;j++){
					sba2=sba2.deleteCharAt(sba2.length()-1);
				}
				if(strb.contains(sba2)){
					System.out.println(minus);
					return;
				}
			}
		}

	}

}
