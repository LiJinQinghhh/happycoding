package JAVA第二次作业;
import java.util.Scanner;

/**李金清 3171104143（第二次作业）
 * 4.1检查一个电话号码是否符合(0000)0000-0000*/
public class Test_04_1 {
	public static void main(String[] args) {	
		// TODO Auto-generated method stub			
	Scanner input=new Scanner(System.in);
	System.out.println("请输入电话号码：");
	String pass=input.nextLine(); 
	if(pass.matches("\\(\\d{4}\\)(\\d{4})-(\\d{4})")) {
    System.out.println("输入有效");}
	else 
	System.out.println("输入有误!"); }}
    
