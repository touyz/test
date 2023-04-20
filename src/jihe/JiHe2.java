package jihe;

import java.sql.Array;
import java.util.ArrayList;

public class JiHe2
{
    public static void main(String[] args) {
        ArrayList<String> derb=new ArrayList<>();
        derb.add("黄朝飞大撒比");
        derb.add("黄忠海大瓜皮");
        derb.add("张全西日你妈");
        System.out.print("[");
        for(int a=0;a<derb.size();a++)//结果是：[黄朝飞大撒比, 黄忠海大瓜皮, 张全西日你妈]
        {
            if(a==derb.size()-1)
            {
                System.out.print(derb.get(a));
            }
            else
            {
                System.out.print(derb.get(a)+", ");
            }
        }
        System.out.println("]");
    }
}