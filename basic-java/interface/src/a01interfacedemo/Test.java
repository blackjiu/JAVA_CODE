package a01interfacedemo;
/*练习

        编写带有接口和抽象类的标准Javabean类
动物描述
青蛙：属性：名字，年龄   行为：吃虫子，蛙泳
狗：属性：名字，年龄     行为：吃骨头，狗刨
 兔子：属性：名字，年龄   行为：吃胡萝卜*/
public class Test {
    public static void main(String[] args){
        Frog a=new Frog("小蛙",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a.swim();

        Rabbit b=new Rabbit("小兔",3);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

    }
}
