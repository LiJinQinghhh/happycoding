package JAVA8的新特性作业;
import java.util.function.Consumer;
/**李金清 3171104143*/
public class innerDemo {
	public static void main(String[] args) {	
	}
	public void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
			//打印apps数组中的app
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
	           //匿名内部类
				public void inner1(){
					innerDemo inner=new innerDemo(){
						public void ConsumerApple(Apple[]apps,Consumer<Apple>c) { for(Apple app:apps){
					        c.accept(app);
						} 
						}};
					inner.ConsumerApple(apps,c);//调用
				}
		}
		

