package a01date;

import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args){

        //获取当前电脑上当前的时间
        Date d=new Date();
        System.out.println(d);

        //指定一个时间
        Date d2=new Date(0L);
        System.out.println(d2);

        //修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //获取当前时间毫秒值
        long time=d2.getTime();
        System.out.println(time);
    }
}
