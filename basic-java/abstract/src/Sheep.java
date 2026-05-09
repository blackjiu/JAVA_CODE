/*山羊Sheep
属性：名字，年龄
行为：吃草，喝水*/
public class Sheep extends Animal{

    public Sheep(String name,int age){
        super(name,age);
    }
    @Override
    public void eat() {

        System.out.println("山羊吃草");
    }
}
