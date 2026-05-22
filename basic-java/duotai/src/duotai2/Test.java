package duotai2;
/*
多态调用成员特点
1.调用成员变量：编译看左，运行看左
2.调用成员方法：编译看左，运行看右
*/
class Person{
    String name="父亲名";
    public void show(){
        System.out.println("父类的show方法");
    }
}


class Student extends Person {
    String name="儿子名";
   @Override
    public void show(){
        System.out.println("子类的show方法");
    }

}
public class Test {
    public static void main(String[] args){
        //创建对象（多态形式）
        Person a=new Student();

        //1.调用成员变量：编译看左，运行看左
        //编译看左：javac编译时，会看父类有没有这个变量，如果右编译成功，没有编译失败
        //运行看左：java运行代码时，实际获取的就是左类父亲成员变量的值
        System.out.println(a.name);//父亲名

    //2.调用成员方法：编译看左，运行看右
        //编译看左：javac编译时，会看父类有没有这个方法，如果右编译成功，没有编译失败
        //运行看右：java运行代码时，实际上运行的是子类的方法
        a.show();//子类名
    }
}
