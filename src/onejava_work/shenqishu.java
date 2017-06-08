package onejava_work;
/**
 * 给出一个区间[a, b]，计算区间内“神奇数”的个数。神奇数的定义：存在不同位置的两个数位，组成一个两位数（且不含前导0）
 * 且这个两位数为质数。比如：153，可以使用数字3和数字1组成13，13是质数，满足神奇数。同样153可以找到31和53也为质数，只要找到一个质数即满足神奇数。 
 * 
 * 输入为两个整数a和b，代表[a, b]区间 (1 ≤ a ≤ b ≤ 10000)  e.g 11 20
 * 输出为一个整数，表示区间内满足条件的整数个数 e.g 6
 * 
 * 首先是关于质数的计算，质数计算普遍使用筛选法，这个筛选法很有趣
 * 用个boolean数组，默认全是false false也表示是质数 数组的大小意味着你要求多少范围内的质数
 * 然后先把0和1设为true 他们不是存在质数的讨论。
 * 循环从i=2开始 i如果一开始不是true 显然就是和数 然后把它的2倍，3倍等等（在数组范围内）变为true
 * 然后i++ 最后得到的boolean数组 值不是true的下标都是质数 本题只用的到100以内的质数
 * 
 * 这道题的逻辑就是 先把每个数变成方便操作的char数组 然后抽取2个配对 有前后区别 同一个数不能抽两次 配对产生的数有一个是质数就改变flag的值
 * 然后在循环尾把计数器加1
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class shenqishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int head ,foot;
		head=sc.nextInt();
		foot=sc.nextInt();
		ArrayList<Integer> zhishu = zhishu();
		int count=0;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=head;i<=foot;i++){
			boolean flag = false;
			Integer t = i;
			String str = t.toString();
			char[]ch = str.toCharArray();
			for(int x=0;x<ch.length;x++){
				if(Integer.parseInt(ch[x]+"")!=0){
					for(int y=0;y<ch.length;y++){
						if(x!=y){
							Integer test = Integer.parseInt(ch[x]+"0")+Integer.parseInt(ch[y]+"");
							if(zhishu.contains(test))	{flag = true; break;}
						}
					}
				}
				if(flag){
					break;
				}
			}
			if(flag){
				count++;
				arr.add(i);
				System.out.println(i);
			}
		}
		System.out.println(count);
		
	}
	public static ArrayList<Integer> zhishu(){
		boolean[] num = new boolean[100];
		num[0]=num[1]=true;
		for(int i=2;i<num.length;i++){
			if(!num[i]){
				for(int j=i*2;j<num.length;j+=i){
					num[j]=true;
				}
			}
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<num.length;i++){
			if(!num[i]){
				arr.add(i);
			}
		}
		arr.trimToSize();
		return (arr);
	}

}
