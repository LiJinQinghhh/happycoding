/**����� 3171104143���ڶ�����ҵ��
 * 3. дһ�����ӣ�ʵ�ְ�װ���������������֮��ת����ʵ�ְ�װ�����ַ����໥ת����ʵ�ֻ��������������ַ���֮���໥ת��
 */
public class Text_03 {

	public static void main(String[] args) {
		//�ѻ�����������ת���ɰ�װ�ࣺ�Զ�װ��
		Integer i1=new Integer(10);
		System.out.println(i1);
		//�Ѱ�װ��ת��Ϊ�����������ͣ��Զ�����
		int i2=i1.intValue();
		System.out.println(i2);
		Integer i3=10;//���鷽ʽ:ֱ�Ӷ��壬��Ҫnew����
		System.out.println(i3);
		Integer i4=new Integer("123");//�ַ��������װ��
		System.out.println(i4);
		String num1="12";
		int i5=Integer.parseInt(num1);//����ֵ�ַ���ת����int����
		System.out.println(i5);
		//Integer i6=Integer.valueOf(num1);valueOf����Ч��û��parseInt�� 
		//int i6=Integer.valueOf(num1);
		
	}

}
