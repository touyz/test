/*
* 垃圾回收的时候，会自动调用这个方法finalize方法
* 有点类似与静态代码块，静态代码块在类加载的时候执行，并且只执行一次
* 那么同样的，finalize 也是一个时机，这个方法不需要程序员手动调用，只需要重写就行了。
* GC来负责调用
* */
public class ObjectFinalize {
    public static void main(String[] args) {
        Person der=new Person();
        der=null;//把der对象就直接回收了
    }
}
class Person{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被销毁了");
    }
}
