/**����� 3171104143���ڶ�����ҵ��
 * 2.дһ�����ӣ���ϰString������StringBuffer������ת��������StringBuffer�����ӡ����롢ɾ������ת����*/

public class Test_02 {
	public static void main(String[] args) {
		String a="a";
		String b="b" ;
		String c=a+b+1;
		System.out.println(c);
		String d="a"+1+2+3+4+"b";//a1234b//�������û���������⣨�����ڽ����Ż���
		//StringBufferĿ����������ַ������ʱ�������������⣨�������������ƴ���ַ�����
		//StringBuffer���ڲ�ʵ�ֲ����ַ������飬Ĭ������ĳ���Ϊ16�����������Сʱ����̬������㷨��ԭ������*2+2
		//���Ե�����Ԥ֪Ҫ��ӵ����ݳ���ʱ������ʹ�ô���ʼ�������Ĺ��췽���������⶯̬���䣬�Ӷ����Ч��
		//�̰߳�ȫ�ģ���Ӱ�����ܣ�
		StringBuffer sb1=new StringBuffer(32);//�������Ĺ��죨���飩
		sb1.append(a).append(b).append(1);//��ӣ����ֲ�ͬ�������Ͷ����Լӣ�
		System.out.println(sb1.toString());
		StringBuffer sb2=new StringBuffer("abc");
		sb2.delete(0, 1);//ɾ��
		System.out.println(sb2.toString());
		StringBuffer sb3=new StringBuffer("12345");
		sb3.insert(0, true);//���루offset��λ�ã�����Ԫ�أ�
		System.out.println(sb3.toString());
		StringBuffer sb4=new StringBuffer("12345");
		sb4.reverse();//��ת
		System.out.println(sb4.toString());
		
	}
}
