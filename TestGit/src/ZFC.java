import java.util.regex.Matcher;//����regex��ʾ�����������ʽ
import java.util.regex.Pattern;
public class ZFC//�ַ���
{
public static int count(String srcStr, String findStr) {		
	int count = 0;		 
	Pattern p = Pattern.compile(findStr);// ͨ��complie()������������������ʽ���벢�����Pattern��
	Matcher m = p.matcher(srcStr);
	while (m.find()) {// ���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��			
		count++;		}		
	return count;	}

public static void main(String[] args) {	
	// TODO Auto-generated method stub		
	String srcStr = "this is a test of java";		
	String findStr = "s"; 			
	int count = count(srcStr, findStr);	
	System.out.println("��ĸ:" + findStr + "���ַ���" + srcStr + "�г��ֵĴ���Ϊ:"				+ count);
	}}