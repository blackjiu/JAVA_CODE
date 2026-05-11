package duotai01;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生的账号为："+getName()+" "+getPassWord());
    }
}
