package onejava_work;

import java.util.Scanner;

public class tianjiazifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String stra = sc.nextLine();
		String strb = sc.nextLine();
		System.out.println(stra+ " "+strb);
		if(stra.length()>strb.length()){
			System.out.println("strings are wrong ! ");
			return;
		}
		int minus = strb.length()-stra.length();
		int head = 0,foot = 0;
		Integer min = Integer.MAX_VALUE;
		for(head = minus;head>=0;head--,foot++){
			String sa = stra;
			sa = strb.substring(0, head)+sa+strb.substring(strb.length()-foot,strb.length());//beginIndex - 起始索引（包括）。endIndex - 结束索引（不包括）。
			char[] cha = sa.toCharArray();
			char[] chb = strb.toCharArray();
			int count = 0;
			for(int i=0;i<cha.length;i++){
				if(cha[i]!=chb[i])
					count++;
			}
			if(min>=count)min=count;
		}
		System.out.println(min);
	}

}
