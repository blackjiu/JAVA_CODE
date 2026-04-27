/*练习
添加学生对象并遍历

需求：定义一个集合，添加一些学生对象，并进行遍历
学生类的属性为：姓名，年龄。

要求：对象的数据来入自键盘录*/

import java.util.ArrayList;
import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args)
    {
        ArrayList<Student> list=new ArrayList<>();//长度为0
        for (int i = 0; i < 3; i++)
        {
            Student s=new Student();
            Scanner sc=new Scanner(System.in);

            System.out.println("请输入学生名字");
            String name=sc.next();
            System.out.println("请输入学生年龄");
           int age=sc.nextInt();
           //给属性赋值
            s.setName(name);
            s.setAge(age);
            //对象添加到集合
            list.add(s);

        }

        //遍历
        for(int i=0;i<list.size();i++)
        {
            Student ss=list.get(i);
            System.out.println(ss.getName()+" "+ss.getAge());
        }
    }
}
