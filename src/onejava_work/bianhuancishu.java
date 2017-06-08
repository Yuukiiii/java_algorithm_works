package onejava_work;
/**
 * @author Yuukiiii
 * 牛牛想对一个数做若干次变换，直到这个数只剩下一位数字。变换的规则是：将这个数变成 所有位数上的数字的乘积。比如285经过一次变换后转化成2*8*5=80.问题是，要做多少次变换，使得这个数变成个位数。 
 * 输入一个整数。小于等于2,000,000,000 e.g 285
 * 输出一个整数，表示变换次数。e.g 2
 * 
 * String有toCharArray()方法;int加char类型是加asc码的大小，正常加减要用parseint方法
 */
import java.util.Scanner;

public class bianhuancishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    Integer i = sc.nextInt();
	    int count = 0;
	    
	    String str = i.toString();
	    char[] ch = str.toCharArray();
	    for(Integer answer=i;answer>=10;count++){
	    	answer = 1;
	    	for(int j=0;j<ch.length;j++){
	    		answer*=Integer.parseInt(ch[j]+"");
	    	}
	    	str = answer.toString();
	    	ch = str.toCharArray();
	    	System.out.println("answer : "+answer);
	    }
	    sc.close();
	    System.out.println(count);
	        
	}
	
}
