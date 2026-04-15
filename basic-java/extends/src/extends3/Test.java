package extends3;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}
class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";
    public void show() {
        //如何打印Zi
        System.out.println(name);
        System.out.println(this.name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印喝茶
        System.out.println(super.hobby);
        System.out.println(hobby);
        System.out.println(this.hobby);
        //如何打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}