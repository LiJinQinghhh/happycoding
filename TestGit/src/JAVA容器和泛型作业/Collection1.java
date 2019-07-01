package JAVA�����ͷ�����ҵ;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//1.����ѧ���࣬����ѧ�š��������ۺϲ����ܷ֡�ʹ��TreeSet����ѧ�����󣬰������ܷ�����
//���������ͬ������������ ������õ��������ѧ������
public class Collection1 {
	private static void TreeSetTest() {
		Students s1 = new Students(43, "�����", 88);
		Students s2 = new Students(45, "����", 58);
		Students s3 = new Students(49, "С��", 58);
		Students s4 = new Students(53, "����", 82);
		Students s5 = new Students(23, "������", 68);
		Set<Students> students = new TreeSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		// forEach����
		System.out.println("-----------forEach����------------");
		students.forEach((student) -> {
			System.out.println(student);
		});
		// iterator����
		System.out.println("-----------iterator����------------");
		Iterator<Students> it = students.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {
		TreeSetTest();
	}
}

class Students implements Comparable<Students> {
	private int sid;
	private String name;
	private int score;

	@Override
	public int compareTo(Students o) {
		if (this.sid == o.sid)
			return 0;
		else if (this.score == o.score) {
			if (this.name.compareTo(o.name) == 0)
				return this.sid - o.sid;
			else
				return this.name.compareTo(o.name);
		} else
			return this.score - o.score;
		// TODO Auto-generated method stub
	}

	public Students(int sid, String name, int score) {
		super();
		this.sid = sid;
		this.name = name;
		this.score = score;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", score=" + score + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
