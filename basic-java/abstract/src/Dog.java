/*狗Dog
属性：名字，年龄
行为：吃骨头，喝水*/

public class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println("吃骨头");
    }
}
