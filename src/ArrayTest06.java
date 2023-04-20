/*
* 模拟一个系统，要进入系统的话，必须输入用户名和密码
*
* */
public class ArrayTest06 {
    public static void main(String[] args) {//用户和密码会输入到String[] args 这个数组中。
        if(args.length!=2)
        {
            System.out.println("输入错误");
            return;
        }
        String zhanghu=args[0];//取出账户。        }
        String mima=args[1];//取出密码。
        //判断两个字符串相等，需要用到equals方法。
        //if(zhanghu.equals("yangyinguang") && mima.equals("1878477"))
        //这样写可能会导致空指针异常，如果把字符串放到首项就可以防止字符串的异常,老程序员给的建议
        if("yangyinguang".equals(zhanghu) && "1878477".equals(mima))
        {
            System.out.println("登录成功");
        }
        else
        {
            System.out.println("登录失败");
        }

    }
}
