package JAVA第二次作业;
/**李金清 3171104143（第二次作业）
 *4.9文本替换：将字符串中所有的”pupel”替换为”pupil”。*/

public class Test_04_9 {
	public static void main(String[] args) {
		String s="There are many pupel.they are very cute pupel.";
		System.out.println(s.replace("pupel", "pupil"));//没有应用正则表达式
		System.out.println(s.replaceAll("pupel", "pupil"));
		System.out.println(s.replaceAll(".", "pupil"));
		System.out.println(s.replaceAll("\\.", " pupil."));
		System.out.println(s.replaceFirst("pupel", "pupil"));
		System.out.println(s.replaceFirst(".", "pupil "));
		System.out.println(s.replaceFirst("\\.", " pupil "));
		//"."正则表达式中代表除了换行符以外的任意字符，replaceFirst(),replaceAll()都应用了正则
	}
}
