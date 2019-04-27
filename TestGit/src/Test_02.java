/**李金清 3171104143（第二次作业）
 * 2.写一个例子，练习String对象与StringBuffer对象互相转换，测试StringBuffer类的添加、插入、删除、反转操作*/

public class Test_02 {
	public static void main(String[] args) {
		String a="a";
		String b="b" ;
		String c=a+b+1;
		System.out.println(c);
		String d="a"+1+2+3+4+"b";//a1234b//常量相加没有性能问题（编译期进行优化）
		//StringBuffer目的是来解决字符串相加时带来的性能问题（常量与变量）：拼接字符串！
		//StringBuffer的内部实现采用字符串数组，默认数组的长度为16，超过数组大小时，动态扩充的算法是原来长度*2+2
		//所以当我们预知要添加的数据长度时，建议使用带初始化容量的构造方法，来避免动态扩充，从而提高效率
		//线程安全的，会影响性能，
		StringBuffer sb1=new StringBuffer(32);//带容量的构造（建议）
		sb1.append(a).append(b).append(1);//添加（各种不同数据类型都可以加）
		System.out.println(sb1.toString());
		StringBuffer sb2=new StringBuffer("abc");
		sb2.delete(0, 1);//删除
		System.out.println(sb2.toString());
		StringBuffer sb3=new StringBuffer("12345");
		sb3.insert(0, true);//插入（offset：位置，插入元素）
		System.out.println(sb3.toString());
		StringBuffer sb4=new StringBuffer("12345");
		sb4.reverse();//反转
		System.out.println(sb4.toString());
		
	}
}
