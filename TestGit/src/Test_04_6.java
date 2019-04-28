import java.util.Scanner;

/**李金清 3171104143（第二次作业）
 *4.6输入一个字符串，判断该字符串是否以abc结尾。*/
public class Test_04_6 {
	public static void main(String[] args) {	
		// TODO Auto-generated method stub			
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个字符串：");
	String pass=input.nextLine(); 
	if(pass.matches(".*abc$")) {
    System.out.println("该字符串以abc结尾");}
	else 
	System.out.println("该字符串不是以abc结尾"); }
}
