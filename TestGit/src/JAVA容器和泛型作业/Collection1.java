package JAVA容器和泛型作业;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student extends Object implements Comparable<Student> {
	int stuNo;
	String name;
	int score;

	public Student(int stuNo, String name, int score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (this.stuNo == s.stuNo)
			return 0;
		else if (this.score == s.score) {
			if (this.name.compareTo(s.name) == 0)
				return this.stuNo - s.stuNo;
			else
				return this.name.compareTo(s.name);
		} else
			return this.score - s.score;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", score=" + score + "]";
	}

}

public class Collection1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> set = new TreeSet<Student>();

		Student s1 = new Student(1, "张三", 60);
		set.add(s1);
		Student s2 = new Student(2, "李四", 70);
		set.add(s2);
		Student s3 = new Student(3, "王五", 80);
		set.add(s3);

		//用迭代器输出学生对象
		Iterator<Student> it= set.iterator();
		while( it.hasNext() ) {
			Student s4=it.next();
		}
		System.out.println(set);
	}

}
