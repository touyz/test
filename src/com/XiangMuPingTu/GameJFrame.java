package com.XiangMuPingTu;

import javax.swing.*;

public class GameJFrame extends JFrame  //游戏界面
{
    public GameJFrame()
    {
        initJFrame();
        //初始化菜单
        initMenuBar();

        this.setVisible(true);//让界面直接显示出来，一定是在最后一行
        //初始化图片
        initImage();

    }

    private void initImage()
    {
        //创建一个Image的图片对象
        ImageIcon icon=new ImageIcon("C:\\Users\\PC\\Desktop\\天空之城\\test\\JavaSE17\\image\\P2.jpg");
        //创建一个JLabel的图片对象
        JLabel jlabel=new JLabel(icon);
        //指定位置
        jlabel.setBounds(0,0,105,105);

        //把管理容器添加到界面当中去
        //this.add(jlabel);
        this.getContentPane().add(jlabel);
    }


    private void initMenuBar() {
        //创建整个菜单对象
        JMenuBar jmenuBar=new JMenuBar();
        //创建菜单上面的选项的对象
        JMenu function=new JMenu("功能");
        JMenu aboutFunction=new JMenu("关于");
        //创建选项下面的条目对象
        JMenuItem replayGame=new JMenuItem("重新游戏");
        JMenuItem replayLogin=new JMenuItem("重新登录");
        JMenuItem closeGame=new JMenuItem("关闭游戏");

        JMenuItem gongZong=new JMenuItem("公众号");
        //将每一个选项下面的条目添加到选项当中
        function.add(replayGame);
        function.add(replayLogin);
        function.add(closeGame);

        aboutFunction.add(gongZong);

        //将菜单里的两个选项添加到菜单当中
        jmenuBar.add(function);
        jmenuBar.add(aboutFunction);

        //给整个界面设置菜单

        this.setJMenuBar(jmenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);//设置界面的宽高
        //设置界面的标题
        this.setTitle("欢迎来到杨银光的第一个Java拼图小游戏 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置
        this.setLayout(null);
    }
}
