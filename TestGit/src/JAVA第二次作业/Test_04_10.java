package JAVA�ڶ�����ҵ;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**����� 3171104143���ڶ�����ҵ��
 *4.10��һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����
�ַ���Ϊ��
"%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"*/
public class Test_04_10 {//�ض��ַ�����ȡ
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
