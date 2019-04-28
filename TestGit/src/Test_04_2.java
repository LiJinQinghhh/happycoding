import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**李金清 3171104143（第二次作业）
 * 4.2将一个字符串中所有的ip地址打印出来*/
public class Test_04_2 {
	public static void main(String[] args) {
	Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
	String ip="      317.110.41.43";
	Matcher m=p.matcher(ip);
	if(m.find()) {
		System.out.println("ip地址:"+ip.substring(m.start(),m.end()));
		}	
	}
}
	
