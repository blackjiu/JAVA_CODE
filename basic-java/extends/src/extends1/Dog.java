package extends1;
/*四种动物分别有以下的行为：
 - 布偶猫：吃饭、喝水、抓老鼠
- 中国狸花猫：吃饭、喝水、抓老鼠
- 哈士奇：吃饭、喝水、看家、拆家
- 泰迪：吃饭、喝水、看家、蹭一蹭*/
public class Dog extends Animal {
    public void lookHome(){
        System.out.println("看家");
    }
}
