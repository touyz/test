/*
* 学完面向对象之后，以后的工作就是new对象，调方法....
* Object 所有子类通用的，任何一个子类默认继承Object，就算没有直接继承，也是间接继承。
* Object有哪些方法呢？
* 什么是API： 整个JDK的类库就是一个javase的API。应用程序编程接口。SUN公司提前写好的这套类库
* 目前为止，需要学习这几个方法： clone 负责克隆 equals 判断两个对象是否相等  tostring 将对象转换为字符串
*hasCode 获取对象的哈希值的一个方法   finalize  垃圾回收器负责调用的方法
 *
* */
/*public class ObjectTest01 {
    public static void main(String[] args) {

    }
}*/
/*
* 先看toString 方法
* 先看源代码
* public String toString()
* {
*   return getClass().getName()+"@"+Interger.toHexString(hashCode());
* }
* SUN公司设计toString方法的作用是 将Java对象转换成字符串的表示形式。
* 建议所有的子类都重写此方法。
* toString 方法是一个简介的，详实的，容易阅读的。
* toString方法都是要重写的。
* */
/*public class ObjectTostring
{
    public static void main(String[] args) {
        Mytime der=new Mytime(2022,5,11);
        String der1=der.toString();
        System.out.println(der1);//Mytime@1b6d3586,这个是结果，但是不简介，不详实，不容易阅读。所以建议重写
        //toString方法。//2022年5月11日,重写之后的结果就是这个。
    }
}
class Mytime{
     int year;
    int month;
    int day;
   public Mytime()
   {
       //无参构造
   }
   public Mytime(int year,int month,int day)//有参构造
   {
      this.year=year;
      this.month=month;
      this.day=day;
   }
   public String toString()
   {
       return this.year+"年"+this.month+"月"+this.day+"日";
   }
}*/
public class ObjectTostring
{
    public static void main(String[] args) {
        ObjectTostring a=new ObjectTostring();
        System.out.println(a.toString());//ObjectTostring@1b6d3586

    }
}

