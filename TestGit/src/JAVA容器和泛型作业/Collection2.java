package JAVA�����ͷ�����ҵ;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�ѧ��Student����ַString��
 * ѧ�����ԣ����������䡣?ע�⣺������������ͬ����Ϊͬһ��ѧ����?��֤ѧ����Ψһ�ԡ�
 * ����map��������ѧ����Ϊ������ַ��Ϊֵ����map���ֱ�ʹ��keySet��entrySet����map��Ԫ��
 */

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Student_1, String> map = new HashMap<Student_1, String>();
		
		Student_1 s1 = new Student_1("С��",19);
		Student_1 s2 = new Student_1("С��",20);
		Student_1 s3 = new Student_1("С��",21);
		
		map.put(s1,"�����أ�����");
		map.put(s2,"�����أ�����");
		map.put(s3,"�����أ�����");
		
		//ʹ��keySet����
		System.out.println("keySet:");
		for(Student_1 key:map.keySet()) {
			System.out.println(key +"     "+map.get(key));
		}
		
		System.out.println();
		
		//ʹ��entrySet����
		System.out.println("entrySet:");
		for(Entry<Student_1, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}
	}

}

class Student_1 {

	String name;
	int age;

	public Student_1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student_1 [name=" + name + ", age=" + age + "]";
	}

	
}
