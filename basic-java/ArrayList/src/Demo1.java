//遍历
import java.util.ArrayList;
public class Demo1 {
    public static void main(String[] args){
      ArrayList<String> list=new ArrayList<>();
      list.add("aaa");
      list.add("bbb");
        System.out.println(list);
      for(int i=0;i<list.size();i++){
          String str=list.get(i);
          System.out.print(str );
      }


    }
}
