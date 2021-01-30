package GUI;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;


import Client.Connect;
import base.DIYClass.Item;
import base.DIYClass.User;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Shoplist2 extends JFrame implements MouseListener,ActionListener{
	
	JPanel jphy1,jphy2,jphy3,jphy4,jphy4_1,jphy4_2;
	JButton jphy_jb1,jphy_jb2,jphy_jb3,jphy_jb4,jphy_jb5,jphy4_jb1,flashback;
	JScrollPane jsp1;
	String onewId;
	JLabel jl1;
	JTextField jtf;
	User u0;
	Connect con;
	Item [] itemArr;
	JLabel [] jbls1 = new JLabel[50];    //文字
//	JLabel [] jbls2 = new JLabel[50];	//没用的
	JPanel [] jpls = new JPanel[50];    //用来存放单个商品信息
	JPanel [] panel = new JPanel[10];   //用流式布局新建
	TextBorderUtlis border = new TextBorderUtlis(Color.black,3,true);
	public Shoplist2(User u) {
		
//		this.onewId = u.getName();
//		try { // 使用Windows的界面风格 
//			   UIManager
//			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
		u0=u;
		jphy1 = new JPanel(new BorderLayout());   //总的容器
		jphy1.setBackground(Color.white);
		jphy2 = new JPanel(new GridLayout(10,1,4,0));   //中间显示商品信息
//		jphy2 = new JPanel(new FlowLayout(0,4,4)); 
		jphy2.setBackground(Color.black);
		jphy3= new JPanel(new GridLayout(1,4));     //底部按钮面板
		jphy3.setBackground(Color.LIGHT_GRAY);
		jphy4 = new JPanel(new GridLayout(1,2));
		jphy4_1 = new JPanel(new GridLayout(1,1));
		jphy4_1.setBackground(Color.white);
		jphy4_2 = new JPanel(new FlowLayout(4,4,4));   //创建一个新的流布度局管理器，具有指定的内对容齐方式以及指定的水平和垂直间隙。
		jphy4_2.setBackground(Color.white);
		
		jtf = new JTextField();
		jtf.setPreferredSize(new Dimension(200,20));
		TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
//		jtf.setBorder(border);
		jphy4_jb1 = new JButton("搜索商品", new ImageIcon("src\\images\\图片5.png"));
		jphy4_jb1.setBorderPainted(false);
		jphy4_jb1.addActionListener(this);
		jphy4_jb1.setBackground(new Color(232,232,232));
//		jphy4_jb1.setContentAreaFilled(false);
		jphy4_jb1.setForeground(Color.black);
//		jl1=new JLabel("山大交易站",JLabel.CENTER);
		jl1=new JLabel("山大交易站", new ImageIcon("src\\images\\图片6.jpg"),JLabel.CENTER);
//		jl1.setPreferredSize(new Dimension(0, 50));
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("微软雅黑", Font.BOLD, 20));
//		jphy_jb1 = new JButton("我的好友");
//		jphy_jb1.setContentAreaFilled(false);
//		jphy_jb1.setBorderPainted(false);
		jphy_jb2 = new JButton("商品", new ImageIcon("src\\images\\图片1.png"));
//		jphy_jb2.setContentAreaFilled(false);
//		jphy_jb2.setBorderPainted(false);
		jphy_jb2.setBorder(border);
		jphy_jb2.setBackground(new Color(232,232,232));
//		jphy_jb2.setForeground(Color.white);
		jphy_jb3 = new JButton("拍卖大会", new ImageIcon("src\\images\\图片2.png"));
//		jphy_jb3.setContentAreaFilled(false);
		jphy_jb3.setBackground(new Color(232,232,232));
//		jphy_jb3.setForeground(Color.black);
//		jphy_jb3.setBorderPainted(false);
		jphy_jb4 = new JButton("购物车", new ImageIcon("src\\images\\图片3.png"));
//		jphy_jb4.setContentAreaFilled(false);
		jphy_jb4.setBackground(new Color(232,232,232));
		jphy_jb4.setForeground(Color.black);
//		jphy_jb4.setBorderPainted(false);
		jphy_jb5 = new JButton("我的", new ImageIcon("src\\images\\图片4.png"));
//		jphy_jb5.setContentAreaFilled(false);
//		jphy_jb5.setBorderPainted(false);
		jphy_jb5.setBackground(new Color(232,232,232));
//		jphy_jb5.setForeground(Color.black);
		
		
		
		
		
		jphy_jb4.addActionListener(this);
		jphy_jb5.addActionListener(this);
		
		
		for (int i = 0; i < panel.length; i++) {
			panel[i]=new JPanel(new FlowLayout(0,4,4));
		}

		for(int i = 0;i<24;i++){
//			if (i<20) {
//				Image image=new ImageIcon("src\\images\\hardware1.jpg").getImage();  
//				JPanel panel = new BackgroundPanel(image);       //用一个空的Jpanel来装图片
//				panel.setPreferredSize(new Dimension(50, 150));  //设置大小
//				jbls1[i]= new JLabel("这是一个主机",JLabel.CENTER);
//				jbls1[i].setBackground(Color.darkGray);
////				jbls1[i].setForeground(Color.white);
//				jpls[i].add(jbls1[i],BorderLayout.SOUTH);
//				jpls[i].add(panel,BorderLayout.CENTER);
//				jphy2.add(jpls[i]);
//			}else 
				jpls[i]=new JPanel(new BorderLayout(0, 10));     //上下边距为0，左右边距为1
				jpls[i].setPreferredSize(new Dimension(148, 200)); 
				jbls1[i]= new JLabel("name"+(i+1),JLabel.CENTER);
				jbls1[i].setFont(new Font("微软雅黑", Font.BOLD, 15));
//				jbls1[i].setBackground(Color.darkGray);
				Image image=new ImageIcon("src\\images\\hardware1.jpg").getImage();  
				JPanel panel0 = new BackgroundPanel(image);       //用一个空的Jpanel来装图片
				panel0.setPreferredSize(new Dimension(50, 150));  //设置大小
				jpls[i].add(jbls1[i],BorderLayout.SOUTH);
				jpls[i].add(panel0,BorderLayout.CENTER);
				jpls[i].setBackground(Color.lightGray);
				jbls1[i].addMouseListener(this);
//				jbls1[i].setBackground(Color.black);
//				jbls1[i].setFont(new Font("仿宋", Font.BOLD,15));
				panel[(int)(i/5)].add(jpls[i]);
//				panel[(int)(i/5)].setBackground(Color.white);       /////这里设置了一下
		}
		
		for (int i = 0; i < panel.length; i++) {
			jphy2.add(panel[i]);
		}
//		for (int i = 0; i < itemArr.length; i++) {
//			jpls[i]=new JPanel(new BorderLayout(0, 10));     //上下边距为0，左右边距为10
//			Image image=new ImageIcon("src\\images\\hardware1.jpg").getImage();  
//			JPanel panel = new BackgroundPanel(image);       //用一个空的Jpanel来装图片
//			panel.setPreferredSize(new Dimension(50, 150));  //设置大小
//			jbls1[i]= new JLabel(itemArr[i].getName(),JLabel.CENTER);
//			jbls1[i].setBackground(Color.darkGray);
////		jbls1[i].setForeground(Color.white);
//			jpls[i].add(jbls1[i],BorderLayout.SOUTH);
//			jpls[i].add(panel,BorderLayout.CENTER);
//			jphy2.add(jpls[i]);
//		}
		
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		jphy3.add(jphy_jb4);
		jphy3.add(jphy_jb5);
		jphy3.setPreferredSize(new Dimension(0, 50));
		
		
		jphy4_1.add(jl1);
		jphy4_2.add(jtf);
		jphy4_2.add(jphy4_jb1);
		flashback = new JButton(new ImageIcon("src\\images\\图片9.jpg"));
		flashback.setPreferredSize(new Dimension(30,30));
		flashback.setContentAreaFilled(false);
		flashback.setBorderPainted(false);
		flashback.addActionListener(this);
		jphy4_2.add(flashback);
		
		jphy4.add(jphy4_1);
		jphy4.add(jphy4_2);
		
		jsp1 = new JScrollPane(jphy2);
		jsp1.getVerticalScrollBar().setUI(new DemoScrollBarUI());
		jsp1.setBackground(Color.white);
//		jsp1.add(jphy2);
		jphy1.add(jphy4,"North");
		jphy1.add(jsp1,"Center");
		jphy1.add(jphy3,"South");
		this.setTitle(onewId);
		this.setDefaultCloseOperation(3);
		this.add(jphy1,"Center");
		this.setSize(800,800);
		this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
		this.setUndecorated(false); 
		this.setVisible(true);
//		this.pack();
		System.out.println(u0.getName());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jphy_jb4) {   //购物车按钮
			
			new ShoppingTrolley2(u0);
			this.dispose();
//			this.setVisible(true);
		}
		
		if (e.getSource()==jphy_jb5) {    //我的按钮
			
			new Mine2(u0);
			this.dispose();
		}
		
		if (e.getSource()==jphy4_jb1) {    //搜索按钮
//			
			JPanel tjphy2 = new JPanel(new GridLayout(10,1,4,0));   //中间显示商品信息
//			jphy2 = new JPanel(new FlowLayout(0,4,4)); 
			tjphy2.setBackground(Color.LIGHT_GRAY);
			JLabel [] tjbls1 = new JLabel[50];    //文字
//			JLabel [] jbls2 = new JLabel[50];	//没用的
			JPanel [] tjpls = new JPanel[50];    //用来存放单个商品信息
			JPanel [] tpanel = new JPanel[10];   //用流式布局新建
			
			for (int i = 0; i < tpanel.length; i++) {
				tpanel[i]=new JPanel(new FlowLayout(0,4,4));
			}

			for(int i = 0;i<25;i++){
					tjpls[i]=new JPanel(new BorderLayout(0, 10));     //上下边距为0，左右边距为1
					tjpls[i].setPreferredSize(new Dimension(148, 200)); 
					tjbls1[i]= new JLabel("name"+(i+1),JLabel.CENTER);
					Image image=new ImageIcon("src\\images\\hardware2.jpg").getImage();  
					JPanel panel0 = new BackgroundPanel(image);       //用一个空的Jpanel来装图片
					panel0.setPreferredSize(new Dimension(50, 150));  //设置大小
					tjpls[i].add(tjbls1[i],BorderLayout.SOUTH);
					tjpls[i].add(panel0,BorderLayout.CENTER);
					tjbls1[i].addMouseListener(this);
					tjbls1[i].setBackground(Color.black);
					tjbls1[i].setFont(new Font("仿宋", Font.BOLD,15));
					tpanel[(int)(i/5)].add(tjpls[i]);
					tpanel[(int)(i/5)].setBackground(Color.white);
			}
			
			for (int i = 0; i < tpanel.length; i++) {
				tjphy2.add(tpanel[i]);
			}
			JPanel tjphy4_2 = new JPanel(new FlowLayout(4,4,4));   //创建一个新的流布度局管理器，具有指定的内对容齐方式以及指定的水平和垂直间隙。
			tjphy4_2.setBackground(Color.white);
			
			JScrollPane tjsp=new JScrollPane(tjphy2);
			jphy1.removeAll();
			jphy1.repaint();
//			jphy1.add(Insert.setInsert());
			jphy1.add(jphy4,"North");
			jphy1.add(tjsp,"Center");
			jphy1.add(jphy3,"South");
			jphy1.revalidate();
		}
		
		if (e.getSource()==flashback) {
			
			JScrollPane temp=new JScrollPane(jphy2);
			temp.getVerticalScrollBar().setUI(new DemoScrollBarUI());
			jphy1.removeAll();
			jphy1.repaint();
//			jphy1.add(Insert.setInsert());
			jphy1.add(jphy4,"North");
			jphy1.add(temp,"Center");
			jphy1.add(jphy3,"South");
			jphy1.revalidate();
		}
		
	}
	
	public static void main(String[] args) {
		User u=new User();
		u.setGrade("大一");
		u.setUserId("201900301075");
		u.setMajor("软件工程");
		u.setName("牛毅群");
		u.setSex("男");
		new Shoplist2(u);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		for (int i = 0; i < 25; i++) {
			if (e.getSource()==jbls1[i]) {
				
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; i++) {
			if (e.getSource()==jbls1[i]) {
				jbls1[i].setForeground(Color.red);
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		for (int i = 0; i < 25; i++) {
			if (e.getSource()==jbls1[i]) {
				jbls1[i].setForeground(Color.black);
			}
		}
		
	}

}


