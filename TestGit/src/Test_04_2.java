import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**����� 3171104143���ڶ�����ҵ��
 * 4.2��һ���ַ��������е�ip��ַ��ӡ����*/
public class Test_04_2 {
	public static void main(String[] args) {
	Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
	String ip="      317.110.41.43";
	Matcher m=p.matcher(ip);
	if(m.find()) {
		System.out.println("ip��ַ:"+ip.substring(m.start(),m.end()));
		}	
	}
}
	
