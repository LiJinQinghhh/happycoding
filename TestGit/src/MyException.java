/**�Զ����쳣ͨ��ͨ���̳���ʵ��
 * 1.Throwable
 * 2.Exception
 * 3.RuntimeException
 * �Զ����쳣��ʵ��ͨ���ǣ��ṩ���췽��
 * �쳣��������û��ʵ�ʹ��ܣ�ֻ��һ��������ı�ʶ
 * Exception:�ܼ��쳣���ڱ����ڼ�飬�ڵ����׳�����쳣�ķ���ʱ��������ʾ��ʹ��try&catch
 * RuntimeException:���ܼ��쳣���������ڼ�飬�ڵ����׳�����쳣�ķ���ʱ�����Բ�����ʾ��ʹ��try&catch
 * ��ʹ���Զ����쳣ʱ������ʵ�ʵ�ҵ������������ʹ���ĸ���Ϊ�̳еĸ���
*/
class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}}