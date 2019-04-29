package JAVA第二次作业;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**李金清 3171104143（第二次作业）
 *4.10从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
字符串为：
"%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"*/
public class Test_04_10 {//特定字符串提取
	public static void main(String[] args) {
		String s="%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
		Pattern p=Pattern.compile("%CXLL=.*?(?=%)");
		Matcher m=p.matcher(s);
		int i=0;
		while(m.find()) {
			 System.out.print(m.group()+"\n");
		}
	}
}
