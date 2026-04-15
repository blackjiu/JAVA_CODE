package extends2;

class Fu2{
    String name="张五";
}
class Zi2 extends Fu2{
    String name="张三";
    public void show(){
        String name="小美";
        System.out.println(name);//就近原则
        System.out.println(this.name);//访问成员
        System.out.println(super.name);//访问父类
    }

}
public class Test2 {
    public static void main(String[] args){
        Zi a=new Zi();
        a.show();
    }
}