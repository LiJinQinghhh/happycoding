package studying;

public class InterfaceTest {
		public static void main(String[] args) {
			Girl mm=new Girl("李金清",20);
			mm.eat();
			mm.run();
			mm.sleep();
			System.out.println(mm.printInfo());
		}
}
//只能定义全局常量+抽象方法
interface Ieat{
	
	//抽象方法不实现方法，只定义
	//public abstract void eat();方法中没有声明修饰符，默认public abstract，等价于下面的语句
	void eat();
	//public static final int NUM=10;等价于下面的语句
	int NUM=10;
}
interface Irun{
	void run();
}
//接口可以进行多继承，类不可以
interface Isleep extends Ieat,Irun {
	void sleep();
}
//实现类可以实现多个接口，但是必须实现接口中的所有方法
class Girl implements Ieat,Isleep{
	private String name;
	private int age;
	public Girl() {}
	//利用构造方法或者setter方法来对对象进行初始化操作（赋值）
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
		System.out.println("我是"+name+",我爱健身跑");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("我今年"+age+"岁，我需要睡美容觉");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("我爱吃好吃的");
	}
	public String printInfo() {
		return "name:"+name+",age:"+age;
	}
	
}
