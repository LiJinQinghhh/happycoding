package JAVA�쳣������ҵ;
import java.util.Scanner;
public class LoginDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//Scanner�÷�
		System.out.println("�������û�����");
		String name=input.nextLine();
		System.out.println("���������룺");
		String pass=input.nextLine();
		input.close();//�ر�����
		UserService us=new UserService();
		try {
			User user =us.login(name, pass);
			System.out.println("��½�ɹ�");
			System.out.println(user);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
