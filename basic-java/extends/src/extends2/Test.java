package extends2;
//继承中成员变量访问特点：就近原则
class Fu{
    String name="张五";
}
class Zi extends Fu{
    //String name="张三";
    public void show(){
        //String name="小美";
        System.out.println(name);
    }

}
public class Test {
    public static void main(String[] args){
        Zi a=new Zi();
        a.show();
    }
}
