import java.util.ArrayList;

/*练习：添加用户对象并判断是否存在
需求：
1.main方法中定义一个集合，存入三个用户对象。
用户属性为：id, username, password
2.要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回索引
如果不存在，返回-1     */
//我还要你返回存在返回true，不存在返回false


public class Demo8 {
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
        int a=getIndex(list,"04");
        System.out.println(a);

        boolean b=chazhao(list,"04");
        System.out.println(b);


    }

    //true和false
    public static boolean chazhao(ArrayList<User> list,String id)
    {
        /*for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getId().equals(id))
            {
                return true;
            }
        }

        return false;*/

        //防御性编程。也体现了高内聚，低耦合思想
       /* 防御性编程的体现
            - 把复杂的遍历逻辑封装在 getIndex()里，对外只暴露简洁的接口。
        - 避免在多个地方写重复的循环，减少因复制粘贴导致的bug（比如循环条件写错、变量名写错）。*/
        return getIndex(list,id)>=0;

    }

//索引
    public static int getIndex(ArrayList<User> list,String id)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getId().equals(id))
            {
                return i;
            }
        }

        return -1;
    }

}





