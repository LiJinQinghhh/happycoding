package JAVA�ڶ�����ҵ;
import java.util.Scanner;

/**����� 3171104143���ڶ�����ҵ��
 * 4.1���һ���绰�����Ƿ����(0000)0000-0000*/
public class Test_04_1 {
	public static void main(String[] args) {	
		// TODO Auto-generated method stub			
	Scanner input=new Scanner(System.in);
	System.out.println("������绰���룺");
	String pass=input.nextLine(); 
	if(pass.matches("\\(\\d{4}\\)(\\d{4})-(\\d{4})")) {
    System.out.println("������Ч");}
	else 
	System.out.println("��������!"); }}
    
