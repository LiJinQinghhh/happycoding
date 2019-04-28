/**李金清 3171104143（第二次作业）
 * 4.3将字符串中连续出现的字符压缩成一个。
 * 比如aaabbbccccd，压缩后变成abcd。*/
public class Test_04_3 {
	public static void main(String[] args) {
		String s="aaabbbccccd";
		String rs=s.replaceAll("(.)(\\1)*","$1");
		System.out.println("字符串压缩后为"+rs);
}}