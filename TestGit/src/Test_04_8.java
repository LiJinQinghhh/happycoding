import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**����� 3171104143���ڶ�����ҵ��
 *4.8��һ���ַ����е�����������ȡ������������һά�����С�
 *���硱ae256dd��w348e6������ȡ��256,348,6��������*/
public class Test_04_8 {
	public static void main(String[] args) {
	 String s="ae256dd��w348e6";
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

