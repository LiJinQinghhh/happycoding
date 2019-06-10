package JAVA容器和泛型作业;

/*
 * HashSet是如何检测是否有重复元素的，并写程序验证
 */

import java.util.HashSet;
import java.util.Set;
//结论：HashSet是以key的形式保存元素，key唯一，则HashSet中不会出现重复的元素。
class People{
	
	Integer id;
	String name;
	
	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}

	//equals和hasCode方法不重写则会出现相同的
	@Override
	public boolean equals(Object o) {
		
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
			People people = (People) o;
			
			return id.equals(people.id);
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}

public class Collection6 {
	public static void main(String[] args) {
		
		Set<People> hashSet = new HashSet<>();
		People p1 = new People(1,"金请");
		People p2 = new People(2,"翠花");
		People p3 = new People(1,"张杰");
		
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		
		hashSet.forEach(str -> System.out.println(str));
		
	}
}

