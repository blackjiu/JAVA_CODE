/*练习 集合的遍历方式
需求：定义一个集合，添加字符串，并进行遍历
遍历格式参照：[元素1, 元素2, 元素3]。*/
import java.util.ArrayList;
public class Demo2 {
    public static void main(String[] ars){
        //1.创建集合
        ArrayList<String> list=new ArrayList<>();
        //2.添加元素
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");
       // System.out.print(list); [元素1, 元素2, 元素3]

        System.out.print("[");

        //3.遍历
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }
            else
            {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");

    }
}
