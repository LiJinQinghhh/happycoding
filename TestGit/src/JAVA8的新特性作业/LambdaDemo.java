package JAVA8����������ҵ;
//Lambda���ʽ������ʽ�ӿڣ�ֻ��һ����������ͨ�ӿڣ���Ϊ�˼�JAVA�нӿ�ʽ�������ڲ���
/**
 * �﷨��(����1������2)->{}*/
//import java.util.function.Consumer;
public class LambdaDemo {
	
	
	public static void main(String[] args) {
		IEat ieat=new IEatImpl();
		ieat.eat();
		//�����ڲ���
		IEat ieat2=new IEat(){
			public void eat() {
				System.out.println("eat banana");
			}
		};
		ieat2.eat();
		//Lambda���ʽ
		//�ô���1.������Ӽ�� 2.
		IEat ieat3=()->{System.out.println("eat thing");};
		ieat3.eat();
	}
}
//ֻ��һ�����󷽷��Ľӿ�
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