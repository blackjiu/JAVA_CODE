/*练习
        编写带有抽象类的标准Javabean类


狗Dog
属性：名字，年龄
行为：吃骨头，喝水

 山羊Sheep
属性：名字，年龄
行为：吃草，喝水*/

public abstract class Animal {
    private String name;
    private int age;
    public Animal(){

    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void drink(){
        System.out.println("喝水");
    }
    public abstract void eat();
}
