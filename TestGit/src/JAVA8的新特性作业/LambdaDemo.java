package JAVA8的新特性作业;
//Lambda表达式（函数式接口：只有一个方法的普通接口）：为了简化JAVA中接口式的匿名内部类
/**
 * 语法：(参数1，参数2)->{}*/
//import java.util.function.Consumer;
public class LambdaDemo {
	
	
	public static void main(String[] args) {
		IEat ieat=new IEatImpl();
		ieat.eat();
		//匿名内部类
		IEat ieat2=new IEat(){
			public void eat() {
				System.out.println("eat banana");
			}
		};
		ieat2.eat();
		//Lambda表达式
		//好处：1.代码更加简洁 2.
		IEat ieat3=()->{System.out.println("eat thing");};
		ieat3.eat();
	}
}
//只有一个抽象方法的接口
interface IEat{
	public void eat();
}
class IEatImpl implements IEat{
	public void eat() {
		System.out.println("eat apple");
		
	}
	/**public static void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
		for(Apple app:apps) {
			c.accept(app);
		}}*/
}