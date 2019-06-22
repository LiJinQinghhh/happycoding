package studying;

public class finalTest {
	public static void main(String[] args) {
		System.out.println(constant.PERSON_NUM);
		//System.out.println(Finalclass.DAY_NUM);
		Finalclass fc=new Finalclass();//调用构造方法
		constant c=new constant();
		c.print(10);
	} 
}
//常用类
class constant{
	public static final int PERSON_NUM=1000;
	public void print(final int SIZE) {
				System.out.println(SIZE);
	}
}
class Finalclass{
	//public static final int DAY_NUM=22;
	public final int DAY_NUM;//不赋值会报错
	public Finalclass(){
		DAY_NUM=22;
		System.out.println(DAY_NUM);
	}
}