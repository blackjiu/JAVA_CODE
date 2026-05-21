package duotai01;
//多态：同类型的对象，表现出的不同形态


public class Test {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s=new Student();
        s.setName("李华");
        s.setPassWord("666666");
       // s.show();
        register(s);

        //2.创建老师对象
        Teacher t=new Teacher();
        t.setName("刘老师");
        t.setPassWord("888888");
        //t.show();
        register(t);
    }
public  static  void register(Person p){
        p.show();
}

}
