
public class UserService {
	public User login(String username,String password)throws MyException {
		if(!"�����".equals(username)) {
			throw new MyException("�û�������");	
		}
		if(!"3171104143".equals(password)) {
			throw new MyException("�������");
		}
		User user=new User("�����","3171104143",20,"Ů");
		return user;
	}
}
