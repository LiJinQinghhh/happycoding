package JAVA容器和泛型作业;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 写一个统计投票程序。设有3个候选人，有10人参加选举，每个选举人输入两个候选人的编号，要求输出各个候选人的得票数。
输入描述：输入10个选举人提交的候选人编号
输出描述：输出候选人编号及对应的得票。*
要求，用map来表示投票结果。
 */

//候选人
class Candidate {

	String name;
	int num;

	public Candidate(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

}

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();

		Candidate p1 = new Candidate("小红",1);
		Candidate p2 = new Candidate("小李",2);
		Candidate p3 = new Candidate("小芳",3);

		// 创建HashMap对象，初始化，每人0票
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("输入十个选举人所投候选人号数：");
		String temp = sc.nextLine();
		String[] t = temp.split(" ");//空格分隔
		
		int[] num = new int[20];	
		for (int i = 0; i < t.length; i++) {
			
			num[i] = Integer.parseInt(t[i]);
			
		}
		for(int i=0;i<num.length;i++) {

			Integer j = (Integer) map.get(num[i]);

			if(map.containsKey(num[i]))

				map.put(num[i],++j);

		}
		map.forEach((key,value)->System.out.println(key+ "号候选的的票数为："+value+"票"));

	}

}
