import java.util.regex.Matcher;//参数regex表示输入的正则表达式
import java.util.regex.Pattern;
public class ZFC//字符串
{
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
	}}