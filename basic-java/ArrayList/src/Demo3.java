
//<E>里面要装引用数据类型，所以基本数据类型要变成包装类
//注：int->Integer   char->Character  (其余的首字母变大写)

/*练习 集合的遍历方式
需求：定义一个集合，添加数字，并进行遍历
遍历格式参照：[元素1, 元素2, 元素3]*/

import java.util.ArrayList;
public class Demo3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(222);
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
