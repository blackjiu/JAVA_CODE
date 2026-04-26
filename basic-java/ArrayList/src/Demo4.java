/*练习
添加学生对象并遍历

需求：定义一个集合，添加一些学生对象，并进行遍历
学生类的属性为：姓名，年龄*/

import java.util.ArrayList;
public class Demo4 {
    public static void main(String[] args)
    {
        ArrayList<Student> list=new ArrayList<>();//这个集合只装Student对象

        list.add(new Student("张三",18));
        list.add(new Student("李四",19));
        list.add(new Student("王五",22));
       // System.out.print(list);  //[Student@2f4d3709, Student@4e50df2e, Student@1d81eb93]
        for(int i=0;i<list.size();i++)
        {
            Student s=list.get(i);
            System.out.println(s.getName()+" "+s.getAge());
        }
    }

}
