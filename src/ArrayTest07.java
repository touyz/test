/*
* 数组中存储的类型为引用数据类型
*
*
* */
public class ArrayTest07
{
    public static void main(String[] args)
    {
        //创建一个animals 的数组,先用静态的方法
        Animals der=new Animals();
        Animals der1=new Animals();
        Animals[] fei={der,der1};
        for(int a=0;a<fei.length;a++)
        {
            Animals sb=fei[a];
            sb.move();
            fei[a].move();//代码合并，这样就和简单了，光光。
            //这个不是数组调用方法，是数组当中对象的方法，让数组等于对象。
            //五中送给我的一个理解，很感谢，fei[a],说白了就是数组中的一个元素，der,或者der1,那
            //der或者der1就是属于Animals这个类的，所以有move这个方法，明白？
        }
        Animals[] der3=new Animals[3];//采用的是动态的方法，来初始化这个数组。
        der3[0]=new Animals();//创建一个Animals对象放到数组中的第一个元素当中
        der3[0]=new cat();//子类对象可以放到数组中。
        Animals[] der4={new cat(),new Bird()};//创建一个Animal数组里面放上他的俩个子类，完全可以的！！！
        for(int i=0;i<der4.length;i++)
        {
            Animals der5=der4[i];
            der5.move();
        }

        //调用子类特有的方法就需要向下转型了。!!!!!
        for(int i=0;i<der4.length;i++)
        {
            if(der4[i] instanceof cat)
            {
                cat mao=(cat)der4[i];
                mao.chisi();
            }
            else if(der4[i] instanceof Bird)
            {
                Bird niao=(Bird)der4[i];
                niao.zhuaco();
            }
        }
    }
}
class Animals
{
    public void move()
    {
        System.out.println("动物移动");
    }
}

class cat extends Animals
{
    public void move()
    {
        System.out.println("猫猫走猫步");//写一个子类继承父类，然后看数组是否能继承。
    }
    public void chisi()
    {
        System.out.println("猫猫在吃屎");
    }
}

class Bird extends Animals
{
    public void move()
    {
        System.out.println("小鸟在飞翔");
    }
    public void zhuaco()
    {
        System.out.println("小鸟再抓虫子");
    }
}
