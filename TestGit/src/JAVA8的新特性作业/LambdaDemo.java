package JAVA8����������ҵ;
/**����� 3171104143*/
import java.util.function.Consumer;
public class LambdaDemo{
	public static  void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
	    for(Apple app:apps){
	        c.accept(app);
	} 
}
	public static void main(String[] args) {	
		//����һ��Apple����
		Apple[] apps= {new Apple("red",90),
				       new Apple("blue",70),
				       new Apple("green",100),
				       new Apple("yello",110),
				       new Apple("pink",115),
				       new Apple("black",120),};
		//Lambda���ʽ
		//�ô���1.������Ӽ�� 2.���ᵥ������class�ļ�
		//Lambda���ʽ������ʽ�ӿڣ�ֻ��һ����������ͨ�ӿڣ���Ϊ�˼�JAVA�нӿ�ʽ�������ڲ���
		/**
		 * �﷨��(����1������2)->{}*/
		Consumer<Apple> c=(Apple app)->{System.out.print("["+app.getColor()+","+app.getWeight()+"],");};
		ConsumerApple(apps, c);
		//����ConsumerApple����
	}}
	

	


	

	