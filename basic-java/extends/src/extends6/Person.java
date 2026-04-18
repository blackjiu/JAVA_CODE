package extends6;
//this() 调用本类其他构造方法
//让无参构造，自动给成员变量赋默认值
public class Person {
    String name;
    int age;

    public Person(){
        this("王五",20);
    };

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

}
