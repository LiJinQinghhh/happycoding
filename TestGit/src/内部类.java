public class �ڲ��� {
	public static void main(String[] args) {
		Outer outer=new Outer();
		//Outer.Inner inner=outer.new Inner();
		//inner.print();
		outer.innerprint();//��ӡ�ⲿ��ķ���
		outer.show();//�ⲿ���һ������
		Outer.Inner3 inner3=new Outer.Inner3();//ֱ�ӹ��쾲̬�ڲ���ķ���
		inner3.print();
		outer.print1();
		outer.print2();
		outer.print3(new Eat() {public void eat() {System.out.println("eat:����ʽ�����ڲ���");}});
	}
}
class Outer{
	private String name="happy";
	//��װ�ķ���,�ṩ�������õĽӿ�
	public void innerprint(){
		Inner inner=new Inner();
		inner.print();//����
	}
	//��Ա�ڲ���
	private class Inner{
		public void print(){
			System.out.println("��Ա�ڲ���"+name);
		}
	}
	
	//�����ڲ���
	//show�����ľֲ������򷽷������ǳ���final
	public void show() {
		final int x=10;
		
		class Inner2{
			public void print(){
		System.out.println("�����ڲ���"+x+name);
	}
		}
		Inner2 inner2=new Inner2();
		inner2.print();//����
	}
	
	//��̬�ڲ���(���������ڷ�װ��)
	static class Inner3{
		public void print() {
			System.out.println("��̬�ڲ���");	
		}
	}
	//�����ڲ���
	//�̳�ʽ
	public void print1(){
		Cat cat=new Cat(){
			public void eat() {
				System.out.println("eat:�̳�ʽ�����ڲ���");
			}
		};
		cat.eat();//����
	}
	//�ӿ�ʽ
	public void print2() {
		Eat eat=new Eat() {
			public void eat() {
				System.out.println("eat:�ӿ�ʽ�����ڲ���");
			}
		};eat.eat();//����
	}
	//����ʽ
	public void print3(Eat eat) {
		eat.eat();
	}
}
	interface Eat{
		public void eat();
	}
	abstract class Cat{
		public abstract void eat();//������
	}