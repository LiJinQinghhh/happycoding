package JAVA�����ͷ�����ҵ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

/*
 * ����ѧ���࣬����ѧ�š��������ۺϲ����ܷ֣�ʹ��ArrayList����ѧ������
 * �ȶ�ѧ�������ۺϲ����ܷ��������У���ʹ��Iterator��next�������List�е�Ԫ�ء��ٰ�ѧ����ѧ�Ŵ�С��������
   Iterator��forEachRemaining�������
--��ʾ����ѧ����ʵ��Comparable�ӿڣ���ѧ�����������Ȼ���򡣰��۲����򣬲���ָ���Ƚ�������
 */

class Student2 implements Comparable<Object>{

	String id;

	String name;

	int count;

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getCount() {

		return count;

	}

	public void setCount(int count) {

		this.count = count;

	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", count=" + count + "]";
	}

	public Student2(String id, String name, int count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
	}

	@Override
	public int hashCode() {

		int result;

		result = (this.name == null ? 0 : this.name.hashCode());

		result += this.id.hashCode();

		return result;

	}

	@Override

	public boolean equals(Object o) {

		if (!(o instanceof Collection5)) {
			return false;
		}

		Collection5 s = (Collection5) o;

		if (this.id.equals(s.id)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Student2 s = (Student2) o;

        int result = 0;

        result = this.count > s.count ? 1 : (this.count == s.count ? 0 : -1);

        return result;
	}
	
	

}
class stuComparator implements Comparator<Student2>{
	
	 public int compare(Student2 s1, Student2 s2) {
		 
	        return s1.getId().compareTo(s2.getId());
	        
	    }

}
public class Collection5 {

	public static final Object id = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student2> list = new ArrayList<>();
        list.add(new Student2("01", "����", 95));
        list.add(new Student2("02", "����", 70));
        list.add(new Student2("03", "�仨", 90));
        list.add(new Student2("04", "����", 85));
        
        
        Collections.sort(list);
        //���ܷ�����
        System.out.println("���ܷ�����");
        Iterator<Student2> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println();
        
        //��ѧ������
        System.out.println("��ѧ������");
        list.sort(new stuComparator());
        Iterator<Student2> iteratorA = list.iterator();
        iteratorA.forEachRemaining(System.out::println);
	
	}

}
