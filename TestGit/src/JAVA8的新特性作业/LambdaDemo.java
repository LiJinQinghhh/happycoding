package JAVA8的新特性作业;
/**李金清 3171104143*/
import java.util.function.Consumer;
public class LambdaDemo{
	public static  void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
	    for(Apple app:apps){
	        c.accept(app);
	} 
}
	public static void main(String[] args) {	
		//定义一个Apple数组
		Apple[] apps= {new Apple("red",90),
				       new Apple("blue",70),
				       new Apple("green",100),
				       new Apple("yello",110),
				       new Apple("pink",115),
				       new Apple("black",120),};
		//Lambda表达式
		//好处：1.代码更加简洁 2.不会单独生成class文件
		//Lambda表达式（函数式接口：只有一个方法的普通接口）：为了简化JAVA中接口式的匿名内部类
		/**
		 * 语法：(参数1，参数2)->{}*/
		Consumer<Apple> c=(Apple app)->{System.out.print("["+app.getColor()+","+app.getWeight()+"],");};
		ConsumerApple(apps, c);
		//调用ConsumerApple方法
	}}
	

	


	

	