package JAVA8的新特性作业;
import java.util.Arrays;
import java.util.List;
//Lambda表达式（函数式接口：只有一个方法的普通接口）：为了简化JAVA中接口式的匿名内部类
/**
 * 语法：(参数1，参数2)->{}*/
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;    
public class LambdaDemo {
	public static void main(String[] args) {}
		
		/**匿名内部类
		IEat ieat2=new IEat(String color,String weight){
			public void eat() {
				System.out.println("eat banana");
			}
		};
		ieat2.eat("32","");
		//Lambda表达式
		//好处：1.代码更加简洁 2.不会单独生成class文件
		IEat ieat3=(String color,String weight)->{System.out.println("eat thing");};
		ieat3.eat("casc"," ");
		//带参数
		IEat ieat4=(String thing,String weight)->{System.out.println("eat "+thing+",它重 "+weight);};
		ieat4.eat("红苹果","2.2kg");
	}
}
//只有一个抽象方法的接口
interface IEat{
	public void eat(String color,String weight);
}
class IEatImpl implements IEat{
	public void eat(String color,String weight) {
		System.out.println("eat apple");
		
	}}*/

	public void ConsumerTest(){
	    Consumer<Apple> consumer=(Apple app)->{System.out.println(app.getColor()+","+app.getWeight());};
	    List<Apple> apps=Arrays.asList(new Apple("red", 120),new Apple("blue", 80),
	            new Apple("green",100));
	    ConsumerApple(apps,consumer);
	}

	private void ConsumerApple(List<Apple> apps, Consumer<Apple> consumer) {
			// TODO Auto-generated method stub
			
		}

	public static void ConsumerApple(Apple[]apps,Consumer<Apple>c){
	    for(Apple app:apps){
	        c.accept(app);
	    }
	}
	public void SupplierTest(){
	    Supplier<Apple> supplier=()->{return new Apple("hello supplier",999);};
	    Apple app=supplier.get();
	    System.out.println(app.getColor()+","+app.getWeight());
	}

	public void PredicateTest(){
	    //系统预定义函数式接口测试
	    Predicate<Apple> p1=(Apple a)->{if(a.getWeight()>90) return true;return false;};
	    Predicate<Apple> p2=(Apple a)->{if(a.getColor().equals("blue")) return true;return false;};

	    List<Apple> apps=Arrays.asList(new Apple("red", 120),new Apple("blue", 80),
	            new Apple("green",100));

	    filterApple(apps,p1);//筛选重量大于90g的苹果
	    filterApple(apps,p2);//筛选蓝色的苹果
	}

	public void filterApple(List<Apple> apps,Predicate<Apple> p){
	    for(Apple app:apps){
	        if(p.test(app)){
	            System.out.println(app.getColor()+","+app.getWeight());
	        }
	    }

	} 

	public void FunctionTest(){
	    Function<String,Apple> function=(String s)->{return new Apple(s,666);};
	    Apple app=function.apply("red");
	    System.out.println(app.getColor()+","+app.getWeight());
	    app=function.apply("green");
	    System.out.println(app.getColor()+","+app.getWeight());

	}

}
