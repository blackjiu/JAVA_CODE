package extends7;

public class Manager extends Employee{

    private double jiangJin;
    public Manager(){
        super();
    }
    public Manager(String id,String name,double salary,double jiangJin){
        super(id,name,salary);
        this.jiangJin=jiangJin;
    }
    public void setJiangJin(double jiangJin) {
        this.jiangJin=jiangJin;
    }

    public double getJiangJin() {
        return jiangJin;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
