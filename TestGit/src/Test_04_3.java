/**����� 3171104143���ڶ�����ҵ��
 * 4.3���ַ������������ֵ��ַ�ѹ����һ����
 * ����aaabbbccccd��ѹ������abcd��*/
public class Test_04_3 {
	public static void main(String[] args) {
		String s="aaabbbccccd";
		String rs=s.replaceAll("(.)(\\1)*","$1");
		System.out.println("�ַ���ѹ����Ϊ"+rs);
}}