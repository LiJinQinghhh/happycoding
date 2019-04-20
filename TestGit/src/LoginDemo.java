import java.util.Scanner;
public class LoginDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=input.nextLine();
		System.out.println("请输入密码：");
		String pass=input.nextLine();
		UserService us=new UserService();
		try {
			User user =us.login(name, pass);
			System.out.println("登陆成功");
			System.out.println(user);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
