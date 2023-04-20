/*
静态初始化二维数组
*并且二维数组的遍历，走
*
*
* */
public class ArrayTest10 {
    public static void main(String[] args) {
       // String[][] der={{"yangyinguang","java"},{"hunagzhonghai","c++"},{"huangchaofei","python"}};
        String[][] der={
                {"zhangquanxi","huangchaofei","zhaoxiaojin","huangzhonghai"},
                {"zhutong","herenweijie","lihongchang"},
                {"yangyinguang","wuluhang","liuchuyu"}
        };
        //遍历二维数组
        for(int a=0;a<der.length;a++)//外层循环，负责总共有几行。
        {
            for(int b=0;b<der[a].length;b++)
            {
                System.out.print(der[a][b]);
            }
            System.out.println();
        }
    }
}
