import java.util.Objects;

/*
* 首先一个equals方法的源代码，走！
* public boolean equals (Object obj)
* {
*   return(this==obj);
* }
*双等号比较的是两个数的内存地址！！
* 以后在编程的过程中，都要通过equals方法来判断两个对象是否相等。
* */
public class ObjectEquals {
    public static void main(String[] args) {
        int a=100;
        int b=100;
        System.out.println(a==b);//判断两个基本数据类型是否相等是使用双等号，但是引用数据类型呢？
        //两个引用数据类型指的就是两个Java对象，这个时候就需要用到equals 方法了，走！
        Mytimer sb=new Mytimer(2002,05,11);
        Mytimer sb2=new Mytimer(2002,05,11);
        //创建了两个对象都是2002，05，11，怎么比较呢？
        System.out.println(sb==sb2);//结果是false，因为无法比较两个对象
        boolean sb3=sb.equals(sb2);
        System.out.println(sb3);
    }
}
class Mytimer
{
    int years;
    int month;
    int days;

    public Mytimer(int years, int month, int days) {
        this.years = years;
        this.month = month;
        this.days = days;
    }

    public Mytimer() {
    }
    //这个是重写的equals方法。

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mytimer)) return false;
        Mytimer mytimer = (Mytimer) o;
        return years == mytimer.years && month == mytimer.month && days == mytimer.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(years, month, days);
    }

    @Override
    public String toString() {
        return "Mytimer{" +
                "years=" + years +
                ", month=" + month +
                ", days=" + days +
                '}';
    }

}
//关于这个hasCode方法
//hasCode 方法的执行结果，可以看成是Java对象的内存地址。经过哈希算法转换的一个数字。
