package JAVA�����ͷ�����ҵ;

/*
 * HashSet����μ���Ƿ����ظ�Ԫ�صģ���д������֤
 */

import java.util.HashSet;
import java.util.Set;
//���ۣ�HashSet����key����ʽ����Ԫ�أ�keyΨһ����HashSet�в�������ظ���Ԫ�ء�
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

	//equals��hasCode��������д��������ͬ��
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
		People p1 = new People(1,"����");
		People p2 = new People(2,"�仨");
		People p3 = new People(1,"�Ž�");
		
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		
		hashSet.forEach(str -> System.out.println(str));
		
	}
}

