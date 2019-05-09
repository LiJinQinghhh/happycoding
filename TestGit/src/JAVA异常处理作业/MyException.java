/**自定义异常通常通过继承来实现
 * 1.Throwable
 * 2.Exception
 * 3.RuntimeException
 * 自定义异常的实现通常是，提供构造方法
 * 异常对象本身是没有实际功能，只是一个有意义的标识
 * Exception:受检异常，在编译期检查，在调用抛出这个异常的方法时，必须显示的使用try&catch
 * RuntimeException:非受检异常，在运行期检查，在调用抛出这个异常的方法时，可以不用显示的使用try&catch
 * 在使用自定义异常时，根据实际的业务需求来决定使用哪个作为继承的父类
*/
class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}}