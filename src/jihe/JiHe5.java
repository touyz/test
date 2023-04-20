package jihe;

/*import java.util.ArrayList;

public class JiHe5
{
    public static void main(String[] args)
    {
        ArrayList<User> der=new ArrayList<>();
        User sb1=new User("飞511","黄朝飞","123");
        User sb2=new User("海333","黄忠海","234");
        User sb3=new User("西332","张全西","354");
        //把用户对象添加到集合当中
        der.add(sb1);
        der.add(sb2);
        der.add(sb3);
        boolean x=User.chaId(der,"飞51");
        System.out.println(x);
    }
}

class User {
    private String id;
    private String username;
    private String password;

    public User() {
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    *//*
     * 分析一下功能
     * 我要干嘛？  根据id查找用户
     * 我干这个需要什么才能完成？  到集合中找id  der.id
     * 调用true是否需要方法的结果？返回
     *
     * *//*
    public static boolean chaId(ArrayList<User> der,String id)
    {
        for(int a=0;a<der.size();a++)
        {
            User fuguang=der.get(a);
            String roujia=fuguang.getId();
            if(roujia.equals(id)) {
                return true;
            }
        }
        return false;
    }
}*/


import java.util.ArrayList;

public class JiHe5
{
    public static void main(String[] args)
    {
        ArrayList<User> der=new ArrayList<>();
        User wangshu=new User("不夜侯77","量子杨","122");
        User binglun=new User("白鱼45","贺韩龙","66");
        User xinghan=new User("碧落34","莫子安","4566");
        der.add(wangshu);
        der.add(binglun);
        der.add(xinghan);
        int  x=User.chaId(der,"白鱼45");
        System.out.println(x);
    }
}

class User
{
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
//根据id找用户信息，形象的分析一下 ，有三个人都有id，然后这三个人都站在一起，所以叫集合。
//所以，你这个id要到集合里面去找吧。查找需求还是很重要的！！！！
    public User() {
    }
    public static int  chaId(ArrayList<User> kunling,String id)
    {
        for(int a=0;a<kunling.size();a++)
        {
            User xianling=kunling.get(a);
           String hangu= xianling.getId();
           if(hangu.equals(id))
           {
               return a;
           }
        }
        return -1;
    }
}













