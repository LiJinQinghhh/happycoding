package JAVA容器和泛型作业;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//1.创建学生类，包含学号、姓名、综合测评总分。使用TreeSet保存学生对象，按测评总分排序。
//如果分数相同，按姓名排序。 最后再用迭代器输出学生对象。
public class Collection1 {
	private static void TreeSetTest() {
		Students s1 = new Students(43, "李金清", 88);
		Students s2 = new Students(45, "张三", 58);
		Students s3 = new Students(49, "小明", 58);
		Students s4 = new Students(53, "王五", 82);
		Students s5 = new Students(23, "张语文", 68);
		Set<Students> students = new TreeSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		// forEach遍历
		System.out.println("-----------forEach遍历------------");
		students.forEach((student) -> {
			System.out.println(student);
		});
		// iterator遍历
		System.out.println("-----------iterator遍历------------");
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
