package a02interfacedemo;
/*乒乓球运动员：姓名，年龄，学打乒乓球，说英语
篮球运动员：姓名，年龄，学打篮球
乒乓球教练：姓名，年龄，教打乒乓球，说英语
篮球教练：姓名，年龄，教打篮球*/
public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }
    public PingPangSporter(String name,int age){
        super(name,age);
    }
    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
