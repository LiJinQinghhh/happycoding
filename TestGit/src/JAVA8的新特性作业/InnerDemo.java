package JAVA8的新特性作业;

import java.util.function.Consumer;

/** 李金清 3171104143 */
public class InnerDemo {
	public static  void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
	    for(Apple app:apps){
	        c.accept(app);
	} 
}
		
	public static void main(String[] args) {
	Apple[] apps= {new Apple("red",90),
		       new Apple("blue",70),
		       new Apple("green",100),
		       new Apple("yello",110),
		       new Apple("pink",115),
		       new Apple("black",120),};
	
			ConsumerApple(apps, new Consumer<Apple>() {
		            @Override
		            public void accept(Apple app) {
		                //System.out.println(app.toString());
		                System.out.print("["+app.getColor()+","+app.getWeight()+"],");
		            }
		        });

	}
}
