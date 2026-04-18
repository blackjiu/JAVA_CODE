package extends5;
//子类不能继承父类的构造方法，但能用super()访问
//子类构造方法第一行默认都是super(),不写也存在，且必须在第一行
public class Test {
    public static void main(String[] args){
        //Student s1=new Student();
        Student s2=new Student("张三",18);
        System.out.println(s2.name+","+s2.age);
    }
}
