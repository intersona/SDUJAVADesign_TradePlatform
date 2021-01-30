package GUI;

import java.awt.*;

import javax.swing.*;

public class Test extends JFrame{
	
	JPanel jp0;
	JTextField jtf;
		Test(){
			
			jtf =new JTextField();
			TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
			jtf.setBorder(border);
			jtf.setBounds(100, 80, 200, 20);
			
			this.add(jtf);
			this.setLayout(null);
			this.setSize(700,500);
			this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
			this.setUndecorated(false); 
			this.setVisible(true);
		}
			
		

		public static void main(String[] args){
			new Window();
		}
		
}
class Window extends JFrame
{
    JPanel myPanel1 = new JPanel();//面板1
    JPanel myPanel2 =new JPanel();//面板2
    JButton button1 = new JButton("开始");//按钮1
    JButton button2 = new JButton("开始");//按钮2
    JButton button3 = new JButton("开始");//按钮3
    JSplitPane jSplitPane =new JSplitPane();//设定为左右拆分布局
    public Window()
    {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init()
    {
        jSplitPane.setOneTouchExpandable(true);//让分割线显示出箭头
        jSplitPane.setContinuousLayout(true);//操作箭头，重绘图形
        //jSplitPane.setPreferredSize(new Dimension (100,200));
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);//设置分割线方向
        myPanel1.setSize(400, 400);
        myPanel2.setSize(200, 400);
        jSplitPane.setLeftComponent(myPanel1);//布局中添加组件 ，面板1
        jSplitPane.setRightComponent(myPanel2);//添加面板2
        jSplitPane.setDividerSize(1);//设置分割线的宽度
        //jSplitPane.setDividerLocation(100);//设置分割线位于中央
        jSplitPane.setDividerLocation(400);//设定分割线的距离左边的位置
        setContentPane(jSplitPane);
        //pack();
        myPanel1.add(button1);
        myPanel2.add(button3);
        myPanel2.add(button2);
        //add(myPanel1);
        myPanel1.setBorder(BorderFactory.createLineBorder(Color.green));
        //add(myPanel2);
        myPanel2.setBorder(BorderFactory.createLineBorder(Color.red));
    }

}
