package a02date;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args){

        //月份：范围0-11 如果获取出来的是0，那么实际上是1月
        //在老外眼里：1（星期天）  2（星期一）  3（星期二）。。。
        Calendar c=Calendar.getInstance();

        Date d=new Date(0L);

        c.setTime(d);
       // System.out.println(d);
        System.out.println(c);
c.set(Calendar.YEAR,2000);

    }
}
