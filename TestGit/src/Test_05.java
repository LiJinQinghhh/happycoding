/**����� 3171104143���ڶ�����ҵ��
 * 5.�����ࡣ
�ӿ���̨����һ��yyyy-MM-dd�������գ���ʽ�������ַ������ٽ�������ڼ������죬����FormatStyle.MEDIUM��ʽ���������ڡ�
ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���Ը��ָ�ʽ������ʾ
ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���޸����ʱ�䣨�ֱ��޸���ݡ��·ݡ��졢Сʱ����Ȼ���ӡ���*/
import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
public class Test_05 {

	    public static Date dateAdd(int days) {
	        // ���ڴ�������7����+7
	        Calendar canlendar = Calendar.getInstance();
	        canlendar.add(Calendar.DATE, days); // ������ڲ����������»�ı�
	        return canlendar.getTime();
	    }
	    public static void main(String[] args) { 
	    	Date dNow = new Date( );
	        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	        System.out.println("�����ʱ��Ϊ�� " + ft.format(dNow));
	        Date date = dateAdd(+7);
	        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        System.out.println(" 7�������Ϊ��" + sf.format(date));
	        SimpleDateFormat sf1 = new SimpleDateFormat("E");
	        System.out.println(" 7�������Ϊ��" + sf1.format(date));
	    }
	}
