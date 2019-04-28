import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**李金清 3171104143（第二次作业）
 *4.8将一个字符串中的所有整数提取出来，保存在一维数组中。
 *比如”ae256dd—w348e6”，提取出256,348,6三个整数*/
public class Test_04_8 {
	public static void main(String[] args) {
	 String s="ae256dd—w348e6";
	 String[] num=new String[3];
	 Pattern p=Pattern.compile("\\d+");
	 Matcher m=p.matcher(s);
	 int i=0;
	 while(m.find()) {
	 num[i]=m.group();
	 i++;
	 }
	 for(int j=0;j<i;j++) {
	 System.out.print(num[j]+",");
	 }
	}	
  }

