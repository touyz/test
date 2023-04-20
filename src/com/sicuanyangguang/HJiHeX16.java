package com.sicuanyangguang;

import java.util.Comparator;
import java.util.TreeSet;

/*

首先 来学一下第二种比较器的方法
 直接在集合后面new 一个comparator
* TreeSet 对象排序练习题
* 需求： 请自行选择比较器排序和自然排序两种方式
* 要求： 存入四个字符串，   "c" "ab" "df" "qwer"
* 按照长度排序，如果一样长，则按照字母首字母排序。
*
* */
public class HJiHeX16 {
    public static void main(String[] args) {
        // 创建一个集合
        TreeSet<String> st=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 表示当前要添加的元素，o2 表示红黑树中存在的元素
                int i = o1.length() - o2.length();
                int i1 = i == 0 ? o1.compareTo(o2) : i;
                return i1;
            }
        });
        st.add("c");
        st.add("ab");
        st.add("df");
        st.add("qwer");
        System.out.println(st);

    }
}
