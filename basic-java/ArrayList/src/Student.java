/*添加一些学生对象，
学生类的属性为：姓名，年龄*/
public class Student {
    //私有化成员变量
    //空参 带参构造方法
    //get set方法
    private String name;
    private int age;
    public Student(){};
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
}
