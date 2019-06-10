package JAVA容器和泛型作业;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 每一个学生都有对应的归属地。学生Student，地址String。
 * 学生属性：姓名，年龄。?注意：姓名和年龄相同的视为同一个学生。?保证学生的唯一性。
 * 定义map容器，将学生作为键，地址作为值存入map。分别使用keySet与entrySet遍历map中元素
 */

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Student_1, String> map = new HashMap<Student_1, String>();
		
		Student_1 s1 = new Student_1("小红",19);
		Student_1 s2 = new Student_1("小李",20);
		Student_1 s3 = new Student_1("小芳",21);
		
		map.put(s1,"归属地：宁德");
		map.put(s2,"归属地：连江");
		map.put(s3,"归属地：重庆");
		
		//使用keySet遍历
		System.out.println("keySet:");
		for(Student_1 key:map.keySet()) {
			System.out.println(key +"     "+map.get(key));
		}
		
		System.out.println();
		
		//使用entrySet遍历
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
