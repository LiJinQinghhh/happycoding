public class 内部类 {
	public static void main(String[] args) {
		Outer outer=new Outer();
		//Outer.Inner inner=outer.new Inner();
		//inner.print();
		outer.innerprint();//打印外部类的方法
		outer.show();//外部类的一个方法
		Outer.Inner3 inner3=new Outer.Inner3();//直接构造静态内部类的方法
		inner3.print();
		outer.print1();
		outer.print2();
		outer.print3(new Eat() {public void eat() {System.out.println("eat:参数式匿名内部类");}});
	}
}
class Outer{
	private String name="happy";
	//封装的方法,提供给外界调用的接口
	public void innerprint(){
		Inner inner=new Inner();
		inner.print();//调用
	}
	//成员内部类
	private class Inner{
		public void print(){
			System.out.println("成员内部类"+name);
		}
	}
	
	//方法内部类
	//show方法的局部变量或方法必须是常量final
	public void show() {
		final int x=10;
		
		class Inner2{
			public void print(){
		System.out.println("方法内部类"+x+name);
	}
		}
		Inner2 inner2=new Inner2();
		inner2.print();//调用
	}
	
	//静态内部类(作用体现在封装上)
	static class Inner3{
		public void print() {
			System.out.println("静态内部类");	
		}
	}
	//匿名内部类
	//继承式
	public void print1(){
		Cat cat=new Cat(){
			public void eat() {
				System.out.println("eat:继承式匿名内部类");
			}
		};
		cat.eat();//调用
	}
	//接口式
	public void print2() {
		Eat eat=new Eat() {
			public void eat() {
				System.out.println("eat:接口式匿名内部类");
			}
		};eat.eat();//调用
	}
	//参数式
	public void print3(Eat eat) {
		eat.eat();
	}
}
	interface Eat{
		public void eat();
	}
	abstract class Cat{
		public abstract void eat();//抽象类
	}