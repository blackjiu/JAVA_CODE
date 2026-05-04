import java.util.ArrayList;

/*练习：添加手机对象并返回要求的数据

需求：
- 定义Javabean类：Phone
- Phone属性：品牌，价格。
- main方法中定义一个集合，存入三个手机对象。
- 分别为：小米，1000。苹果，8000。锤子2999。
- 定义一个方法，将价格低于3000的手机信息返回。*/

public class Demo9 {
   public static void main(String[] args)
   {
       ArrayList<Phone> list=new ArrayList<>();
       Phone p1=new Phone("小米",1000);
       Phone p2=new Phone("苹果",8000);
       Phone p3=new Phone("锤子",2999);
       list.add(p1);
       list.add(p2);
       list.add(p3);
      // getPhoneInfo(list);
       //调用集合
ArrayList<Phone> phoneInFoList=getPhoneInfo(list);//这样我还能看低于3000手机的其他信息
       for (int i = 0; i < phoneInFoList.size(); i++) {
           Phone phone=phoneInFoList.get(i);

           System.out.println(phone.getBrand()+" "+phone.getPrice());

       }

   }

   //我要干什么？  查询低于3000手机信息
    //怎样完成？ 传集合比较3000
    //需要返回吗？ 需要
    /*public static void getPhoneInfo(ArrayList<Phone> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            Phone p=list.get(i);
            if(p.getPrice()<3000)
            {
                System.out.println(p.getBrand()+" "+p.getPrice());
            }
        }
    }*/
   //技巧：如果我们想返回多个数据，可以把这写数据先放到一个容器当中，再把容器返回
//集合 数组
   public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list)
   {
       ArrayList<Phone> resultList=new ArrayList<>();
       for (int i = 0; i < list.size(); i++)
       {

           Phone p=list.get(i);
           if(p.getPrice()<3000)
           {
               resultList.add(p);
           }
       }
       return resultList;
   }



}
