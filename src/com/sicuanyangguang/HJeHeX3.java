package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collection;

/*
* 增强for循环，就是迭代器，为了简化迭代器中的代码的书写的。
* 只有所有的单列集合和数组才能用增强for循环,进行遍历。
* 代码格式： for(数据类型 变量名 ： 数组或者集合)
* {
*   System.out.println(变量名);
* }
*
*
* */
public class HJeHeX3
{
    public static void main(String[] args)
    {
        Collection<String> coll=new ArrayList<>();// 创建一个集合
        coll.add("dd");
        coll.add("dd");
        coll.add("dd");
        coll.add("dd");
        for(String der: coll)
        {
            System.out.println(der);
        }
        for (String s : coll) {
            System.out.println(s);
        }
    }
}


// 细节 ： coll.for 自动生成  遍历的过程中，修改第三方变量是不会改变集合中原有的数据的。
