package GUI;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import base.DIYClass.Time;
import base.DIYClass.User;

public class ShoppingTrolley2 extends JFrame implements ActionListener{
	JPanel jphy1,jphy2,jphy3,jphy4,jphy4_1,jphy4_2;
	JButton jphy2_jb1,jphy_jb2,jphy_jb3,jphy_jb4,jphy_jb5,jphy4_jb1;
	JScrollPane jsp1;
	String onewId;
	JLabel jl1,jl2;
	JTextField jtf;
	Image image;
	User u0;
	JSplitPane [] jss;
	public ShoppingTrolley2(User u) {
		
//		try { // 使用Windows的界面风格
//			   UIManager
//			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
		u0=u;
		jphy1 = new JPanel(new BorderLayout());   //总的容器
		jphy1.setBackground(Color.darkGray);
		int kkk=1;
		if (kkk==1) {
			jphy2 = new JPanel(new GridLayout(10,1,10,10));   //中间显示拍卖商品信息
			jphy2.setBackground(Color.white);
//			jphy2.setBackground(Color.LIGHT_GRAY);
			
			
			jss = new JSplitPane[9];
			for (int i = 0; i < jss.length; i++) {
				
				jss[i]= new JSplitPane();
				jss[i].setBackground(Color.darkGray);
				
				jss[i].setOneTouchExpandable(true);//让分割线显示出箭头
				jss[i].setContinuousLayout(true);//操作箭头，重绘图形
				jss[i].setDividerSize(0);//设置分割线的宽度
				jss[i].setDividerLocation(150);
				jss[i].setPreferredSize(new Dimension(300,150));
				
				Image image=new ImageIcon("src\\images\\hardware1.jpg").getImage();  
				JPanel panel0 = new BackgroundPanel(image);       //用一个空的Jpanel来装图片
				panel0.setPreferredSize(new Dimension(100, 150));  //设置大小
				jss[i].setLeftComponent(panel0);
				
				JPanel pane=new JPanel(new GridLayout(1,2));
				JPanel infopane=new JPanel(new FlowLayout(0,4,20));
//				TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
//				infopane.setBorder(border);
				JLabel info=new JLabel("namecccccccccccccccccccc"+i,JLabel.LEFT);
				info.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				infopane.add(info);
				JPanel buttonpane=new JPanel(new FlowLayout(4,30,60));
				JButton time= new JButton("删除");
				time.setBackground(new Color(232,232,232));
				JButton join=new JButton("购买");
				
				buttonpane.add(time);
				buttonpane.add(join);
				pane.add(infopane);
				pane.add(buttonpane);
				jss[i].setRightComponent(pane);
				
//				
				
			}
			
			for (int i = 0; i < jss.length; i++) {
				jphy2.add(jss[i]);
			}
			
			jsp1=new JScrollPane(jphy2);
			jsp1.getVerticalScrollBar().setUI(new DemoScrollBarUI());
		}else {
			jphy2 = new JPanel(new FlowLayout(1));   //中间显示商品信息
			jphy2.setBackground(Color.white);
			jphy2_jb1= new JButton("去逛逛");
			jphy2_jb1.addActionListener(this);
			jphy2_jb1.setBackground(Color.LIGHT_GRAY);
			jphy2_jb1.setForeground(Color.black);
			jl2= new JLabel("您的购物车还是空的");
			JLabel l1 = new JLabel();
			ImageIcon icon = new ImageIcon("src\\images\\图片7.gif"); //在此直接创建对象,注意目录之间的分隔符是双斜线
			l1.setIcon(icon);
			JLabel l2 = new JLabel("   ");
	//		l.setBounds(100, 100, icon.getIconWidth(),icon.getIconHeight());
	//		l.setHorizontalTextPosition(JLabel.CENTER);    //设置文字在jlabel的位置
			jphy2.add(l1);
			jphy2.add(l2);
			jphy2.add(jl2);
			jphy2.add(jphy2_jb1);
		}
		
		
//		jphy_jb2 = new JButton("商品", new ImageIcon("src\\images\\图片1.png"));
////		jphy_jb2.setContentAreaFilled(false);
//		jphy_jb2.setBorderPainted(false);
//		jphy_jb2.setBackground(Color.LIGHT_GRAY);
//		jphy_jb2.setForeground(Color.black);
//		jphy_jb3 = new JButton("社区", new ImageIcon("src\\images\\图片2.png"));
////		jphy_jb3.setContentAreaFilled(false);
//		jphy_jb3.setBackground(Color.LIGHT_GRAY);
//		jphy_jb3.setForeground(Color.black);
//		jphy_jb3.setBorderPainted(false);
//		jphy_jb4 = new JButton("购物车", new ImageIcon("src\\images\\图片3.png"));
////		jphy_jb4.setContentAreaFilled(false);
//		jphy_jb4.setBackground(Color.darkGray);
//		jphy_jb4.setForeground(Color.white);
//		jphy_jb4.setBorderPainted(false);
//		jphy_jb5 = new JButton("我的", new ImageIcon("src\\images\\图片4.png"));
////		jphy_jb5.setContentAreaFilled(false);
//		jphy_jb5.setBorderPainted(false);
//		jphy_jb5.setBackground(Color.LIGHT_GRAY);
//		jphy_jb5.setForeground(Color.black);
		jphy3= new JPanel(new GridLayout(1,4));     //底部按钮面板
		jphy3.setBackground(Color.LIGHT_GRAY);
		jphy4 = new JPanel(new GridLayout(1,2));
		jphy4_1 = new JPanel(new GridLayout(1,1));
		jphy4_1.setBackground(Color.white);
		jphy4_2 = new JPanel(new FlowLayout(4,4,4));   //创建一个新的流布度局管理器，具有指定的内对容齐方式以及指定的水平和垂直间隙。
		jphy4_2.setBackground(Color.white);
		JButton k=new JButton();
		k.setBorderPainted(false);
		k.setContentAreaFilled(false);
		jphy4_2.add(k);
		
		jl1=new JLabel("山大交易站", new ImageIcon("src\\images\\图片6.jpg"),JLabel.CENTER);
//		jl1.setPreferredSize(new Dimension(0, 50));
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		jphy_jb2 = new JButton("商品", new ImageIcon("src\\images\\图片1.png"));
//		jphy_jb2.setContentAreaFilled(false);
//		jphy_jb2.setBorderPainted(false);
//		jphy_jb2.setBackground(Color.black);
//		jphy_jb2.setForeground(Color.white);
		jphy_jb3 = new JButton("拍卖大会", new ImageIcon("src\\images\\图片2.png"));
//		jphy_jb3.setContentAreaFilled(false);
//		jphy_jb3.setBackground(Color.LIGHT_GRAY);
//		jphy_jb3.setForeground(Color.black);
//		jphy_jb3.setBorderPainted(false);
		jphy_jb4 = new JButton("购物车", new ImageIcon("src\\images\\图片3.png"));
//		jphy_jb4.setContentAreaFilled(false);
		jphy_jb4.setBackground(Color.darkGray);
//		jphy_jb4.setForeground(Color.black);
//		jphy_jb4.setBorderPainted(false);
		jphy_jb5 = new JButton("我的", new ImageIcon("src\\images\\图片4.png"));
//		jphy_jb5.setContentAreaFilled(false);
//		jphy_jb5.setBorderPainted(false);
//		jphy_jb5.setBackground(Color.LIGHT_GRAY);
//		jphy_jb5.setBackground(Color.darkGray);
		
		jphy_jb2.addActionListener(this);
		jphy_jb3.addActionListener(this);
		jphy_jb5.addActionListener(this);
		
		
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		jphy3.add(jphy_jb4);
		jphy3.add(jphy_jb5);
		jphy3.setPreferredSize(new Dimension(0, 50));
		
		jphy4_1.add(jl1);
		jphy4.add(jphy4_1);
		jphy4.add(jphy4_2);
		
		jphy1.add(jphy4,"North");
		jphy1.add(jphy3,"South");
		if (kkk==1) {
			jphy1.add(jsp1,"Center");
		}else {
			jphy1.add(jphy2,"Center");
		}
		
		
		
		this.setTitle(u0.getName());
		this.setDefaultCloseOperation(3);
		this.add(jphy1,"Center");
		this.setSize(800,800);
		this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
		this.setUndecorated(false); 
		this.setVisible(true);
		System.out.println(u0.getName());
	}
	
	public static void main(String[] args){
		User u= new User();
		u.setGrade("大一");
		u.setUserId("201900301075");
		u.setMajor("软件工程");
		u.setName("牛毅群");
		u.setSex("男");
		new ShoppingTrolley2(u);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jphy2_jb1) {     //去逛逛
			new Shoplist2(u0);
			this.dispose();
		}
		
		if (e.getSource()==jphy_jb2) {     //商品列表按钮
			new Shoplist2(u0);
			this.dispose();
		}
		
		if (e.getSource()==jphy_jb5) {    //我的按钮
			
			new Mine2(u0);
			this.dispose();
		}
		
	}
}

