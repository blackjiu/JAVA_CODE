import java.util.ArrayList;

/*练习：添加用户对象并判断是否存在
需求：
1.main方法中定义一个集合，存入三个用户对象。
用户属性为：id, username, password
2.要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回true
如果不存在，返回false*/
public class Demo7 {
    public static void main(String[] args)
    {
        ArrayList<User> list=new ArrayList<>();
        User s1=new User("01","张三","123456");
        User s2=new User("02","李四","1234567");
        User s3=new User("03","王五","12345678");
        //添加对象
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //查找对应的用户信息
        boolean a=chazhao(list,"02");
        System.out.println(a);


    }

//我要干嘛？ 根据id查找用户
    //干这件事情需要完成什么？ list id
    //调用处是否有返回结果？ 有
    public static boolean chazhao(ArrayList<User> list,String id)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getId().equals(id))
            {
                return true;
            }
        }

            return false;
    }

}
