package extends4;
/*三种动物分别有以下的行为：
- 哈士奇：吃饭（吃狗粮）、喝水、看家、拆家
- 沙皮狗：吃饭（吃狗粮、吃骨头）、喝水、看家
- 中华田园犬：吃饭（吃剩饭）、喝水、看家*/
public class ShaDog extends Dog{

    @Override
    public void eat() {
        super.eat();//放在方法内
        //System.out.println("吃狗粮");
        System.out.println("吃骨头");
    }
}
