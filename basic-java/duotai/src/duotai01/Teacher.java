package duotai01;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师的账号为："+getName()+" "+getPassWord());
    }
}
