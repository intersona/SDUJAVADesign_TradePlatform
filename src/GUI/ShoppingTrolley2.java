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
		
//		try { // ʹ��Windows�Ľ�����
//			   UIManager
//			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
		u0=u;
		jphy1 = new JPanel(new BorderLayout());   //�ܵ�����
		jphy1.setBackground(Color.darkGray);
		int kkk=1;
		if (kkk==1) {
			jphy2 = new JPanel(new GridLayout(10,1,10,10));   //�м���ʾ������Ʒ��Ϣ
			jphy2.setBackground(Color.white);
//			jphy2.setBackground(Color.LIGHT_GRAY);
			
			
			jss = new JSplitPane[9];
			for (int i = 0; i < jss.length; i++) {
				
				jss[i]= new JSplitPane();
				jss[i].setBackground(Color.darkGray);
				
				jss[i].setOneTouchExpandable(true);//�÷ָ�����ʾ����ͷ
				jss[i].setContinuousLayout(true);//������ͷ���ػ�ͼ��
				jss[i].setDividerSize(0);//���÷ָ��ߵĿ��
				jss[i].setDividerLocation(150);
				jss[i].setPreferredSize(new Dimension(300,150));
				
				Image image=new ImageIcon("src\\images\\hardware1.jpg").getImage();  
				JPanel panel0 = new BackgroundPanel(image);       //��һ���յ�Jpanel��װͼƬ
				panel0.setPreferredSize(new Dimension(100, 150));  //���ô�С
				jss[i].setLeftComponent(panel0);
				
				JPanel pane=new JPanel(new GridLayout(1,2));
				JPanel infopane=new JPanel(new FlowLayout(0,4,20));
//				TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
//				infopane.setBorder(border);
				JLabel info=new JLabel("namecccccccccccccccccccc"+i,JLabel.LEFT);
				info.setFont(new Font("΢���ź�", Font.PLAIN, 15));
				infopane.add(info);
				JPanel buttonpane=new JPanel(new FlowLayout(4,30,60));
				JButton time= new JButton("ɾ��");
				time.setBackground(new Color(232,232,232));
				JButton join=new JButton("����");
				
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
			jphy2 = new JPanel(new FlowLayout(1));   //�м���ʾ��Ʒ��Ϣ
			jphy2.setBackground(Color.white);
			jphy2_jb1= new JButton("ȥ���");
			jphy2_jb1.addActionListener(this);
			jphy2_jb1.setBackground(Color.LIGHT_GRAY);
			jphy2_jb1.setForeground(Color.black);
			jl2= new JLabel("���Ĺ��ﳵ���ǿյ�");
			JLabel l1 = new JLabel();
			ImageIcon icon = new ImageIcon("src\\images\\ͼƬ7.gif"); //�ڴ�ֱ�Ӵ�������,ע��Ŀ¼֮��ķָ�����˫б��
			l1.setIcon(icon);
			JLabel l2 = new JLabel("   ");
	//		l.setBounds(100, 100, icon.getIconWidth(),icon.getIconHeight());
	//		l.setHorizontalTextPosition(JLabel.CENTER);    //����������jlabel��λ��
			jphy2.add(l1);
			jphy2.add(l2);
			jphy2.add(jl2);
			jphy2.add(jphy2_jb1);
		}
		
		
//		jphy_jb2 = new JButton("��Ʒ", new ImageIcon("src\\images\\ͼƬ1.png"));
////		jphy_jb2.setContentAreaFilled(false);
//		jphy_jb2.setBorderPainted(false);
//		jphy_jb2.setBackground(Color.LIGHT_GRAY);
//		jphy_jb2.setForeground(Color.black);
//		jphy_jb3 = new JButton("����", new ImageIcon("src\\images\\ͼƬ2.png"));
////		jphy_jb3.setContentAreaFilled(false);
//		jphy_jb3.setBackground(Color.LIGHT_GRAY);
//		jphy_jb3.setForeground(Color.black);
//		jphy_jb3.setBorderPainted(false);
//		jphy_jb4 = new JButton("���ﳵ", new ImageIcon("src\\images\\ͼƬ3.png"));
////		jphy_jb4.setContentAreaFilled(false);
//		jphy_jb4.setBackground(Color.darkGray);
//		jphy_jb4.setForeground(Color.white);
//		jphy_jb4.setBorderPainted(false);
//		jphy_jb5 = new JButton("�ҵ�", new ImageIcon("src\\images\\ͼƬ4.png"));
////		jphy_jb5.setContentAreaFilled(false);
//		jphy_jb5.setBorderPainted(false);
//		jphy_jb5.setBackground(Color.LIGHT_GRAY);
//		jphy_jb5.setForeground(Color.black);
		jphy3= new JPanel(new GridLayout(1,4));     //�ײ���ť���
		jphy3.setBackground(Color.LIGHT_GRAY);
		jphy4 = new JPanel(new GridLayout(1,2));
		jphy4_1 = new JPanel(new GridLayout(1,1));
		jphy4_1.setBackground(Color.white);
		jphy4_2 = new JPanel(new FlowLayout(4,4,4));   //����һ���µ������Ⱦֹ�����������ָ�����ڶ����뷽ʽ�Լ�ָ����ˮƽ�ʹ�ֱ��϶��
		jphy4_2.setBackground(Color.white);
		JButton k=new JButton();
		k.setBorderPainted(false);
		k.setContentAreaFilled(false);
		jphy4_2.add(k);
		
		jl1=new JLabel("ɽ����վ", new ImageIcon("src\\images\\ͼƬ6.jpg"),JLabel.CENTER);
//		jl1.setPreferredSize(new Dimension(0, 50));
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		
		jphy_jb2 = new JButton("��Ʒ", new ImageIcon("src\\images\\ͼƬ1.png"));
//		jphy_jb2.setContentAreaFilled(false);
//		jphy_jb2.setBorderPainted(false);
//		jphy_jb2.setBackground(Color.black);
//		jphy_jb2.setForeground(Color.white);
		jphy_jb3 = new JButton("�������", new ImageIcon("src\\images\\ͼƬ2.png"));
//		jphy_jb3.setContentAreaFilled(false);
//		jphy_jb3.setBackground(Color.LIGHT_GRAY);
//		jphy_jb3.setForeground(Color.black);
//		jphy_jb3.setBorderPainted(false);
		jphy_jb4 = new JButton("���ﳵ", new ImageIcon("src\\images\\ͼƬ3.png"));
//		jphy_jb4.setContentAreaFilled(false);
		jphy_jb4.setBackground(Color.darkGray);
//		jphy_jb4.setForeground(Color.black);
//		jphy_jb4.setBorderPainted(false);
		jphy_jb5 = new JButton("�ҵ�", new ImageIcon("src\\images\\ͼƬ4.png"));
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
		this.setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
		this.setUndecorated(false); 
		this.setVisible(true);
		System.out.println(u0.getName());
	}
	
	public static void main(String[] args){
		User u= new User();
		u.setGrade("��һ");
		u.setUserId("201900301075");
		u.setMajor("�������");
		u.setName("ţ��Ⱥ");
		u.setSex("��");
		new ShoppingTrolley2(u);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jphy2_jb1) {     //ȥ���
			new Shoplist2(u0);
			this.dispose();
		}
		
		if (e.getSource()==jphy_jb2) {     //��Ʒ�б�ť
			new Shoplist2(u0);
			this.dispose();
		}
		
		if (e.getSource()==jphy_jb5) {    //�ҵİ�ť
			
			new Mine2(u0);
			this.dispose();
		}
		
	}
}

