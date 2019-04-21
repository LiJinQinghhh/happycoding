/**李金清 3171104143（第二次作业）
 * 3. 写一个例子，实现包装类与基本数据类型之间转换；实现包装类与字符串相互转换；实现基本数据类型与字符串之间相互转换
 */
public class Text_03 {

	public static void main(String[] args) {
		//把基本数据类型转化成包装类：自动装箱
		Integer i1=new Integer(10);
		System.out.println(i1);
		//把包装类转化为基本数据类型：自动拆箱
		int i2=i1.intValue();
		System.out.println(i2);
		Integer i3=10;//建议方式:直接定义，不要new构造
		System.out.println(i3);
		Integer i4=new Integer("123");//字符串构造包装类
		System.out.println(i4);
		String num1="12";
		int i5=Integer.parseInt(num1);//把数值字符串转化成int类型
		System.out.println(i5);
		//Integer i6=Integer.valueOf(num1);valueOf接收效率没有parseInt高 
		//int i6=Integer.valueOf(num1);
		
	}

}
