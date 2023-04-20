package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
*
* 数据操作： 创建一个ArrayList 集合，并添加一下的字符串，字符串中前面是姓名，后面是年龄
* " zhangsan"  23
* "lisi" 24
* "wangwu" 25
*  保留年龄大于等于24的人，并将结果收集到Map集合当中。 姓名为键，年龄为值
*
*
* */
public class HStream4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        Map<String, String> map = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(map);

    }
}
