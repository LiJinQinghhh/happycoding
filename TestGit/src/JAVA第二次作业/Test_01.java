package JAVA第二次作业;
/**李金清 3171104143（第二次作业）
 * 1. 编程. 已知字符串："this is a test of java". 
   */
import java.util.Scanner;
import java.util.regex.Matcher;//参数regex表示输入的正则表达式
import java.util.regex.Pattern;
public class Test_01//字符串
{
	//(1) 统计该字符串中字母s出现的次数
public static int count(String srcStr, String findStr) {		
	int count = 0;		 
	Pattern p = Pattern.compile(findStr);// 通过complie()方法将给定的正则表达式编译并赋予给Pattern类
	Matcher m = p.matcher(srcStr);
	while (m.find()) {// 对字符串进行匹配,匹配到的字符串可以在任何位置			
		count++;		}		
	return count;	}

public static void main(String[] args) {	
	// TODO Auto-generated method stub		
	String srcStr = "this is a test of java";		
	String findStr = "s";
	int count = count(srcStr, findStr);	
	System.out.println("字母:" + findStr + "在字符串" + srcStr + "中出现的次数为:"				+ count);
	
	//(2)取出子字符串"test"  //substring
	System.out.println(srcStr.substring(10,14));
	
	//(3) 将本字符串复制到一个字符数组Char[] str中.// toCharArray
	System.out.println(srcStr.toCharArray());
	
	//(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
    String[] a =srcStr.split("\\s+");
    StringBuffer sb =new StringBuffer();//StringBuffer可改变(append方法)，通过构造函数实现
    for (int i=0;i<a.length;i++){
      sb.append(String.valueOf(a[i].charAt(0)).toUpperCase()+a[i].substring(1)+" ");
    }/**1.toUpperCase的意思是将所有的英文字符转换为大写字母，如：String  c = "aBc123".toUpperCase();//结果就是：ABC123。
        2.toLowerCase的意思是将所有的英文字符转换为小写字母，如：String  c = "aBc123".toLowerCase();//结果就是：abc123。*/
    	System.out.println(sb);
    
	   //(5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
	
       StringBuffer buffer = new StringBuffer(srcStr);//1.StringBuffer
        System.out.println(buffer.reverse());
    	for (int i = srcStr.length()-1; i >= 0; i--) {//2.For循环实现： 字符串下标从0开始，长度-1结束。倒序所以从长度-1开始，0结束。
    	    System.out.print(srcStr.charAt(i));
    	    
    	}
 
        //(6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
    	
    	char[] ch = srcStr.toCharArray();
    		System.out.print("\n");
    		System.out.println(ch);
    	
			}}

/**	public static int count(String str,String findStr) {		
	int count = 0;		 
	Pattern p = Pattern.compile(findStr);// 通过complie()方法将给定的正则表达式编译并赋予给Pattern类
	Matcher m = p.matcher(str);
	while (m.find()) {// 对字符串进行匹配,匹配到的字符串可以在任何位置			
		count++;		}		
	return count;	}
	 public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub 
	Scanner input=new Scanner(System.in);;
	        System.out.println("请输入字符串：");  //接收字符串
	        String str=input.nextLine();			
	String findStr = "happy";
	int count = count(str, findStr);	
	System.out.println("字母:" + findStr + "在字符串" + str + "中出现的次数为:"				+ count);}
	 }*/





