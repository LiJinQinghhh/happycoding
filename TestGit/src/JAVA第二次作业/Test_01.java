package JAVA�ڶ�����ҵ;
/**����� 3171104143���ڶ�����ҵ��
 * 1. ���. ��֪�ַ�����"this is a test of java". 
   */
import java.util.Scanner;
import java.util.regex.Matcher;//����regex��ʾ�����������ʽ
import java.util.regex.Pattern;
public class Test_01//�ַ���
{
	//(1) ͳ�Ƹ��ַ�������ĸs���ֵĴ���
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
	
	//(2)ȡ�����ַ���"test"  //substring
	System.out.println(srcStr.substring(10,14));
	
	//(3) �����ַ������Ƶ�һ���ַ�����Char[] str��.// toCharArray
	System.out.println(srcStr.toCharArray());
	
	//(4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��//��������ʽ
    String[] a =srcStr.split("\\s+");
    StringBuffer sb =new StringBuffer();//StringBuffer�ɸı�(append����)��ͨ�����캯��ʵ��
    for (int i=0;i<a.length;i++){
      sb.append(String.valueOf(a[i].charAt(0)).toUpperCase()+a[i].substring(1)+" ");
    }/**1.toUpperCase����˼�ǽ����е�Ӣ���ַ�ת��Ϊ��д��ĸ���磺String  c = "aBc123".toUpperCase();//������ǣ�ABC123��
        2.toLowerCase����˼�ǽ����е�Ӣ���ַ�ת��ΪСд��ĸ���磺String  c = "aBc123".toLowerCase();//������ǣ�abc123��*/
    	System.out.println(sb);
    
	   //(5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)
	
       StringBuffer buffer = new StringBuffer(srcStr);//1.StringBuffer
        System.out.println(buffer.reverse());
    	for (int i = srcStr.length()-1; i >= 0; i--) {//2.Forѭ��ʵ�֣� �ַ����±��0��ʼ������-1�������������Դӳ���-1��ʼ��0������
    	    System.out.print(srcStr.charAt(i));
    	    
    	}
 
        //(6) �����ַ���ת����һ���ַ������飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ���,�����������̨
    	
    	char[] ch = srcStr.toCharArray();
    		System.out.print("\n");
    		System.out.println(ch);
    	
			}}

/**	public static int count(String str,String findStr) {		
	int count = 0;		 
	Pattern p = Pattern.compile(findStr);// ͨ��complie()������������������ʽ���벢�����Pattern��
	Matcher m = p.matcher(str);
	while (m.find()) {// ���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��			
		count++;		}		
	return count;	}
	 public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub 
	Scanner input=new Scanner(System.in);;
	        System.out.println("�������ַ�����");  //�����ַ���
	        String str=input.nextLine();			
	String findStr = "happy";
	int count = count(str, findStr);	
	System.out.println("��ĸ:" + findStr + "���ַ���" + str + "�г��ֵĴ���Ϊ:"				+ count);}
	 }*/





