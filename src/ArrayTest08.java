/*
* 在Java开发中，数组一旦满了就需要扩容，
* 要想扩容就需要新建一个大容量的数组，然后将小容量的数据一个一个拷贝到大容器当中来。
* 因为数组的长度一旦创建就不可变，所以要扩容，但是扩容的效率比较低，因为拷贝的速度比较慢，所以
* 开发的过程尽量少扩容。
* */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] str={78,1,3,3,4,5};//这个是拷贝源，说白了就是小容器，从这个里面拷贝。
        int []dest=new int[10];//动态初始化一个长度为100的数组，元素的默认值为0.也就是目标
        System.arraycopy(str,1,dest,3,2);//完成数组的拷贝
        for(int i=0;i<dest.length;i++)
        {
            System.out.println(dest[i]);
        }
        System.arraycopy(str,0,dest,0,str.length);
        for(int i=0;i<dest.length;i++)
        {
            System.out.println(dest[i]);
        }
    }
}
/*  引用数据类型也是可以拷贝的，
 */
/*
 */
class der
{
    public static void main(String[] args) {
        String[] dijia={"gaiya","yaluo","kuaile","xiongshou"};//拷贝源
        String[] mo=new String[20];
        System.arraycopy(dijia,0,mo,0,dijia.length);
        for(int a=0;a<mo.length;a++)
        {
            System.out.println(mo[a]);
        }
    }
}



