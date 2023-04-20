package jihe;

import java.util.ArrayList;

/*
* 基本类型所对应的包装类，比如
* byte  Byte  short  Short int Int long  Long  folat Folat double  Double boolean  Boolean char Char
* 说白了就是把首字母变成大写的就行了。
*
* */
/*
public class JiHe3 {
    public static void main(String[] args) {
        //创建一个集合,因为要添加一个整数型的，所以应当是Int类型，但是泛型要写成integer
        ArrayList<Integer> der1=new ArrayList<>();
        //添加元素
        der1.add(3);
        der1.add(4);
        der1.add(5);
        der1.add(6);
        der1.add(7);
        //遍历一下
        System.out.print("[");
        for(int a=0;a<der1.size();a++)
        {
            if(a==der1.size()-1)
            {
                System.out.print(der1.get(a));
            }
            else
            {
                System.out.print(der1.get(a)+", ");
            }
        }
        System.out.println("]");
    }
}  当然以上的是添加整数型的，我下面的代码是添加一个字符型的集合，看看我是如何操作的吧
*/
public class JiHe3
{
    public static void main(String[] args)
    {
        //创建一个字符型的集合
        ArrayList<Character> der1=new ArrayList<>();
        //添加元素
        der1.add('a');
        der1.add('b');
        der1.add('b');
        der1.add('b');
        der1.add('b');
        //进行集合的一个遍历
        for(int a=0;a<der1.size();a++)
        {
            System.out.println(der1.get(a));
        }
    }
}

