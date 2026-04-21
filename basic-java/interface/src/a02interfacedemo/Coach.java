package a02interfacedemo;
/*乒乓球运动员：姓名，年龄，学打乒乓球，说英语
篮球运动员：姓名，年龄，学打篮球
乒乓球教练：姓名，年龄，教打乒乓球，说英语
篮球教练：姓名，年龄，教打篮球*/
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
