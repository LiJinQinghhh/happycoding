package JAVA�����ͷ�����ҵ;
import java.util.HashMap;
import java.util.Scanner;

/*
 * дһ��ͳ��ͶƱ��������3����ѡ�ˣ���10�˲μ�ѡ�٣�ÿ��ѡ��������������ѡ�˵ı�ţ�Ҫ�����������ѡ�˵ĵ�Ʊ����
��������������10��ѡ�����ύ�ĺ�ѡ�˱��
��������������ѡ�˱�ż���Ӧ�ĵ�Ʊ��*
Ҫ����map����ʾͶƱ�����
 */

//��ѡ��
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

		Candidate p1 = new Candidate("С��",1);
		Candidate p2 = new Candidate("С��",2);
		Candidate p3 = new Candidate("С��",3);

		// ����HashMap���󣬳�ʼ����ÿ��0Ʊ
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("����ʮ��ѡ������Ͷ��ѡ�˺�����");
		String temp = sc.nextLine();
		String[] t = temp.split(" ");//�ո�ָ�
		
		int[] num = new int[20];	
		for (int i = 0; i < t.length; i++) {
			
			num[i] = Integer.parseInt(t[i]);
			
		}
		for(int i=0;i<num.length;i++) {

			Integer j = (Integer) map.get(num[i]);

			if(map.containsKey(num[i]))

				map.put(num[i],++j);

		}
		map.forEach((key,value)->System.out.println(key+ "�ź�ѡ�ĵ�Ʊ��Ϊ��"+value+"Ʊ"));

	}

}
