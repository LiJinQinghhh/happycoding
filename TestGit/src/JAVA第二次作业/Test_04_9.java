package JAVA�ڶ�����ҵ;
/**����� 3171104143���ڶ�����ҵ��
 *4.9�ı��滻�����ַ��������еġ�pupel���滻Ϊ��pupil����*/

public class Test_04_9 {
	public static void main(String[] args) {
		String s="There are many pupel.they are very cute pupel.";
		System.out.println(s.replace("pupel", "pupil"));//û��Ӧ��������ʽ
		System.out.println(s.replaceAll("pupel", "pupil"));
		System.out.println(s.replaceAll(".", "pupil"));
		System.out.println(s.replaceAll("\\.", " pupil."));
		System.out.println(s.replaceFirst("pupel", "pupil"));
		System.out.println(s.replaceFirst(".", "pupil "));
		System.out.println(s.replaceFirst("\\.", " pupil "));
		//"."������ʽ�д�����˻��з�����������ַ���replaceFirst(),replaceAll()��Ӧ��������
	}
}
