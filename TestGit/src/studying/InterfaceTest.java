package studying;

public class InterfaceTest {
		public static void main(String[] args) {
			Girl mm=new Girl("�����",20);
			mm.eat();
			mm.run();
			mm.sleep();
			System.out.println(mm.printInfo());
		}
}
//ֻ�ܶ���ȫ�ֳ���+���󷽷�
interface Ieat{
	
	//���󷽷���ʵ�ַ�����ֻ����
	//public abstract void eat();������û���������η���Ĭ��public abstract���ȼ�����������
	void eat();
	//public static final int NUM=10;�ȼ�����������
	int NUM=10;
}
interface Irun{
	void run();
}
//�ӿڿ��Խ��ж�̳У��಻����
interface Isleep extends Ieat,Irun {
	void sleep();
}
//ʵ�������ʵ�ֶ���ӿڣ����Ǳ���ʵ�ֽӿ��е����з���
class Girl implements Ieat,Isleep{
	private String name;
	private int age;
	public Girl() {}
	//���ù��췽������setter�������Զ�����г�ʼ����������ֵ��
	public Girl(String name) {
		this.name=name;
	}
	public Girl(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����"+name+",�Ұ�������");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�ҽ���"+age+"�꣬����Ҫ˯���ݾ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Ұ��ԺóԵ�");
	}
	public String printInfo() {
		return "name:"+name+",age:"+age;
	}
	
}
