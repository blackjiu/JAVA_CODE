package duotai3;
//多态的缺点：编译时看左边，所以不能调用子类特有的功能
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");}
        public void lookHome(){
            System.out.println("狗看家");
        }
    }



public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
        //编译看左，运行看右
        a.eat();

        //多态弊端：不能调用子类特有功能
        //a.lookHome();

        //解决方案:强制转换
        //Dog d=(Dog)a;
        //d.lookHome();

        //细节：转换的时候不能瞎转，转成其他类型就会报错
        //Cat c=(Cat)a;

        //防止瞎转：instanceof
        /*if(a instanceof Dog){
            Dog c=(Dog)a;
            c.lookHome();
        } else if (a instanceof Cat) {
            Cat b=(Cat)a;
        }else {
            System.out.println("没这个类型无法装换");
        }*/
        //新特征

        if(a instanceof Dog c){

            c.lookHome();
        } else if (a instanceof Cat b) {

        }else {
            System.out.println("没这个类型无法装换");
        }
        }
    }

