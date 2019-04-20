
public class UserService {
	public User login(String username,String password)throws MyException {
		if(!"李金清".equals(username)) {
			throw new MyException("用户名错误");	
		}
		if(!"3171104143".equals(password)) {
			throw new MyException("密码错误");
		}
		User user=new User("李金清","3171104143",20,"女");
		return user;
	}
}
