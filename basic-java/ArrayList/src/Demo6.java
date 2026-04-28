//把Student s=new Student();移动到外面
import java.util.ArrayList;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args)
    {
        ArrayList<Student> list=new ArrayList<>();//长度为0
        Student s=new Student();//这是移到外面
        for (int i = 0; i < 3; i++)
        {
            //Student s=new Student();
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入学生名字");
            String name=sc.next();
            System.out.println("请输入学生年龄");
           int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);//这时是修改的同一个地址里的东西，因为只创建了一次对象

        }

        //遍历
        for(int i=0;i<list.size();i++)
        {
            Student ss=list.get(i);
            System.out.println(ss.getName()+" "+ss.getAge());//导致这里面三个输出都一样
        }
    }
}
