import java.util.Scanner;

/**����� 3171104143���ڶ�����ҵ��
 *4.6����һ���ַ������жϸ��ַ����Ƿ���abc��β��*/
public class Test_04_6 {
	public static void main(String[] args) {	
		// TODO Auto-generated method stub			
	Scanner input=new Scanner(System.in);
	System.out.println("������һ���ַ�����");
	String pass=input.nextLine(); 
	if(pass.matches(".*abc$")) {
    System.out.println("���ַ�����abc��β");}
	else 
	System.out.println("���ַ���������abc��β"); }
}
