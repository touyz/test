/*
* 动态初始化，二维数组
*并且遍历这个二维数组，走！
*
*
* */
public class ArrayTest11 {
    public static void main(String[] args) {
        int[][] a=new int[3][4];//有3个一维数组，每个一维数组中有4个元素。
        for(int b=0;b<a.length;b++)
        {
            for(int c=0;c<a[b].length;c++)
            {
                System.out.println(a[b][c]);
            }
            System.out.println();
        }
        int[][] y={{5,5},{6,6}};
        ArrayTest11.chuancan(y);//实参上写的就是数组名，形参传递的是整个数组，可以把数组名改一下
    }
    //玩一下数组的传参数，有点好玩，尝试一下

    public static void chuancan(int [][]x)
    {
        for(int a=0;a<x.length;a++)
        {
            for(int b=0;b<x[a].length;b++)
            {
                System.out.print(x[a][b]);
            }
            System.out.println();
        }
    }
}
