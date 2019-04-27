/**李金清 3171104143（第二次作业）
 * 5.日期类。
从控制台输入一个yyyy-MM-dd（年月日）格式的日期字符串，再将这个日期加上七天，再用FormatStyle.MEDIUM格式输出这个日期。
使用java8的日期时间包获取当前系统时间，并以各种格式加以显示
使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果*/
import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
public class Test_05 {

	    public static Date dateAdd(int days) {
	        // 日期处理：比如7天后就+7
	        Calendar canlendar = Calendar.getInstance();
	        canlendar.add(Calendar.DATE, days); // 如果日期不够减，则月会改变
	        return canlendar.getTime();
	    }
	    public static void main(String[] args) { 
	    	Date dNow = new Date( );
	        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	        System.out.println("今天的时间为： " + ft.format(dNow));
	        Date date = dateAdd(+7);
	        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        System.out.println(" 7天后日期为：" + sf.format(date));
	        SimpleDateFormat sf1 = new SimpleDateFormat("E");
	        System.out.println(" 7天后星期为：" + sf1.format(date));
	    }
	}
