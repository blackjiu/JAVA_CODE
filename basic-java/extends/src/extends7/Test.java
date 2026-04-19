package extends7;
/*练习 带有继承结构的标准Javabean类

1.经理
- 成员变量：工号，姓名，工资，管理奖金
- 成员方法：工作(管理其他人)，吃饭(吃米饭)

2.厨师
- 成员变量：工号，姓名，工资
- 成员方法：工作(炒菜)，吃饭(吃米饭)*/
public class Test {
    public static void main(String[] args){
        //创建经理对象
        Manager m=new Manager("001","张三",10000,8000);
        System.out.println(m.getId()+","+m.getName()+","+m.getJiangJin()+","+m.getSalary());
        m.work();
        m.eat();

        System.out.println("-------------");
        //创建厨师对象
        Cook c=new Cook();
        c.setId("003");
        c.setName("李华");
        System.out.println(c.getId()+","+c.getName());
        c.work();
        c.eat();

    }
}
