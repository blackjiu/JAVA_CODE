package extends1;
/*练习
继承的练习（自己设计一个继承体系）

现在有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪。
暂时不考虑属性，只要考虑行为。
请按照继承的思想特点进行继承体系的设计。

四种动物分别有以下的行为：
- 布偶猫：吃饭、喝水、抓老鼠
- 中国狸花猫：吃饭、喝水、抓老鼠
- 哈士奇：吃饭、喝水、看家、拆家
- 泰迪：吃饭、喝水、看家、蹭一蹭*/

//在工具设计图，从上往下画图：先画具体的子类，再把他们共同行为往上抽
//再写代码时：从上往下写，先写顶层父类，在往下写，最后写具体品种
//java支持单继承，不支持多继承，但支持多层继承
//每个类直接或间接继承object类

public class Test {
    public  static void main(String[] args)
    {
        //1.创建布偶猫对象
        BuouCat a=new BuouCat();
        a.drinkAnimal();
        a.eatAnimal();
        a.grabCat();

        System.out.println("-------------");



        //2.创建哈士奇
        HaDog b=new HaDog();
        b.drinkAnimal();
        b.eatAnimal();
        b.lookHome();
        b.chaiHomeHaDog();

    }

}
