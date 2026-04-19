package extends7;
/*练习 带有继承结构的标准Javabean类
1.经理
- 成员变量：工号，姓名，工资，管理奖金
- 成员方法：工作(管理其他人)，吃饭(吃米饭)

2.厨师
- 成员变量：工号，姓名，工资
- 成员方法：工作(炒菜)，吃饭(吃米饭)*/
public class Employee {
    //1.类名见名知意
    //2.所有的成员变量都需要私有
    //3.构造方法（空参 带全部参）
    //get/set
    private String id;
    private String name;
    private  double salary;
    public Employee(){};
    public  Employee(String id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public void work(){
        System.out.println("工作");
    }
    public void eat(){
        System.out.println("吃米饭");
    }
}
