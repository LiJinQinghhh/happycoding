package JAVA8����������ҵ;
import java.util.function.Consumer;
/**����� 3171104143*/
public class innerDemo {
	public static void main(String[] args) {	
	}
	public void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
			//��ӡapps�����е�app
		    for(Apple app:apps){
		        c.accept(app);
		} 
	}
		Apple[] apps= {new Apple("red",90),
		       new Apple("blue",70),
		       new Apple("green",100),
		       new Apple("yello",110),
		       new Apple("pink",115), 
		       new Apple("black",120),};
	           //�����ڲ���
				public void inner1(){
					innerDemo inner=new innerDemo(){
						public void ConsumerApple(Apple[]apps,Consumer<Apple>c) { for(Apple app:apps){
					        c.accept(app);
						} 
						}};
					inner.ConsumerApple(apps,c);//����
				}
		}
		

