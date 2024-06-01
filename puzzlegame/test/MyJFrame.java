package BlackMa.com.lele.puzzlegame.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    //创建一个按钮对象
    JButton jtb1 = new JButton("点我啊");
    JButton jtb2 = new JButton("再点我啊");


    public MyJFrame(){
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 V1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);


        //设置位置和宽高
        jtb1.setBounds(0,0,100,50);
        //给按钮添加事件
        jtb1.addActionListener(this);


        //设置位置和宽高
        jtb2.setBounds(100,0,100,50);
        //给按钮添加事件
        jtb2.addActionListener(this);


        //把按钮添加到整个界面当中
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);






        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取当前被操作的那个按钮对象
        Object source = e.getSource();

        if(source == jtb1){
            jtb1.setSize(200,200);
        }else if(source == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }



    }
}
