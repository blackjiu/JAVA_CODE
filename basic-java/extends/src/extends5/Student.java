package extends5;
//子类不能继承父类的构造方法，但能用super()访问
//子类构造方法第一行默认都是super(),不写也存在，且必须在第一行
//super()是子类创建对象时给父类赋值的
//super()只能写在构造方法种
public class Student extends Person{

    //父类的无参构造：super()
    public Student(){
        super();//必需写在第一行
    }


    //父类有参构造：super(参数)
 public Student(String name,int age)
 {
     super(name, age);
 }

}
