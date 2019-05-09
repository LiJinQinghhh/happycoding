package JAVA新特性作业;

import java.util.function.Consumer;

public class LambdaDemo {
	public static void ConsumerApple(Apple[]apps,Consumer<Apple>c) {
		for(Apple app:apps) {
			c.accept(app);
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
	}
}
