package a01interfacedemo;
/*动物描述
青蛙：属性：名字，年龄   行为：吃虫子，蛙泳
狗：属性：名字，年龄     行为：吃骨头，狗刨
兔子：属性：名字，年龄   行为：吃胡萝卜*/
public class Frog extends Animal implements Swim{
public Frog(){}
    public Frog(String name,int age){
    super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }



}
