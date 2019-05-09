package JAVA8����������ҵ;
import java.util.Arrays;
import java.util.List;
//Lambda���ʽ������ʽ�ӿڣ�ֻ��һ����������ͨ�ӿڣ���Ϊ�˼�JAVA�нӿ�ʽ�������ڲ���
/**
 * �﷨��(����1������2)->{}*/
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;    
public class LambdaDemo {
	public static void main(String[] args) {}
		
		/**�����ڲ���
		IEat ieat2=new IEat(String color,String weight){
			public void eat() {
				System.out.println("eat banana");
			}
		};
		ieat2.eat("32","");
		//Lambda���ʽ
		//�ô���1.������Ӽ�� 2.���ᵥ������class�ļ�
		IEat ieat3=(String color,String weight)->{System.out.println("eat thing");};
		ieat3.eat("casc"," ");
		//������
		IEat ieat4=(String thing,String weight)->{System.out.println("eat "+thing+",���� "+weight);};
		ieat4.eat("��ƻ��","2.2kg");
	}
}
//ֻ��һ�����󷽷��Ľӿ�
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
	    //ϵͳԤ���庯��ʽ�ӿڲ���
	    Predicate<Apple> p1=(Apple a)->{if(a.getWeight()>90) return true;return false;};
	    Predicate<Apple> p2=(Apple a)->{if(a.getColor().equals("blue")) return true;return false;};

	    List<Apple> apps=Arrays.asList(new Apple("red", 120),new Apple("blue", 80),
	            new Apple("green",100));

	    filterApple(apps,p1);//ɸѡ��������90g��ƻ��
	    filterApple(apps,p2);//ɸѡ��ɫ��ƻ��
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
