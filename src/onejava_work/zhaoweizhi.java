package onejava_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Yuukiiii
 * 对给定的一个字符串，找出有重复的字符，并给出其位置，如：abcaaAB12ab12 。
 * 输出
 * a:0,a:3,a:4,a:9
 * b:1,b:10
 * 1:7,1:11
 * 2:8,2:12
 *  
 * 1、下标从0开始。2、相同的字母在一行表示出其出现过的位置。
 */
public class zhaoweizhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the String : ");
        String n = sc.nextLine();
        ArrayList<Character> arrcha = new ArrayList<>();
        HashMap<Character,String> pos = new HashMap<>();
        char[] ch = n.toCharArray();
        for(int i=0;i<ch.length;i++){
        	if(!arrcha.contains(ch[i])){
        		arrcha.add(ch[i]);
        		pos.put(ch[i], ch[i]+"  "+i);
        	}else{
        		String str = pos.get(ch[i]);
        		str+=" ; "+ch[i]+"  "+i;
        		pos.put(ch[i], str);
        	}
        }
        for(char c: arrcha){
        	if(pos.get(c).length()>5)
        		System.out.println(pos.get(c));
        }
        sc.close();
	}

}