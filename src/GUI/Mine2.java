package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import base.DIYClass.User;


public class Mine2 extends JFrame implements ActionListener{
	
	JPanel jphy1,jphy2,jphy3,jphy4,jphy4_1,jphy4_2,jphy2_1,jphy2_2,jphy2_3 ;
	JButton jphy_jb1,jphy_jb2,jphy_jb3,jphy_jb4,jphy_jb5,jphy4_jb1,jphy4_jb2,jphy4_jb3,jphy4_jb4;
	JScrollPane jsp1;
	String onewId;
	JLabel jl1,jl2,jl3;
	JLabel blank1,blank2,userId,sex,name,major,grade,psex;
	JTextField userIdfi,sexfi,namefi,majorfi,gradefi;
	User u0;
	JButton jbb=new JButton("ȷ���޸�");
	
	public Mine2(User u) {
		
//		try { // ʹ��Windows�Ľ�����
//			   UIManager
//			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
		u0=u;
		jphy1 = new JPanel(new BorderLayout());   //�ܵ�����
		jphy1.setBackground(Color.darkGray);
		
		jphy2= new JPanel(new GridLayout(1,2));   //�м���ʾ��Ϣ������
		jphy2.setBackground(Color.white);
		jphy3= new JPanel(new GridLayout(1,4));     //�ײ���ť���
		jphy2_1= new JPanel(new FlowLayout(1,4,20));   //��   
//		jphy2_1.setBackground(Color.white);
//		jphy2_1.setBackground(Color.darkGray);
		jphy2_2= new JPanel(new GridLayout(8,1));   //�ұ�
//		jphy2_2.setBackground(Color.white);
//		jphy2_3.setBackground(Color.darkGray);
//		jphy2_2.setPreferredSize(new Dimension());
		
		
		blank2 =new JLabel("     ");
		jl2 = new JLabel("�������ģ�");
		jl2.setForeground(Color.black);
		jl2.setFont(new Font("΢���ź�", Font.BOLD,30));
		blank1 =new JLabel("   ");
		userId =new JLabel("�û�����"+u0.getUserId());
//		userId.setPreferredSize(new Dimension(400, 50));
		userId.setFont(new Font("����", Font.BOLD, 30));
		sex =new JLabel("�Ա�"+u0.getSex());
//		sex.setPreferredSize(new Dimension(400, 50));
		sex.setFont(new Font("����", Font.BOLD, 30));
		name =new JLabel("���֣�"+u0.getName());
//		name.setPreferredSize(new Dimension(400, 50));
		name.setFont(new Font("����", Font.BOLD, 30));
		major =new JLabel("רҵ��"+u0.getMajor());
//		major.setPreferredSize(new Dimension(400, 50));
		major.setFont(new Font("����", Font.BOLD, 30));
		grade =new JLabel("�꼶��"+u0.getGrade());
//		grade.setPreferredSize(new Dimension(400, 50));
		grade.setFont(new Font("����", Font.BOLD, 30));
		userIdfi = new JTextField();
		userIdfi.setPreferredSize(new Dimension(200,30));
		sexfi = new JTextField();
		sexfi.setPreferredSize(new Dimension(200,30));
		namefi = new JTextField();
		namefi.setPreferredSize(new Dimension(200,30));
		majorfi = new JTextField();
		majorfi.setPreferredSize(new Dimension(200,30));
		gradefi = new JTextField();
		gradefi.setPreferredSize(new Dimension(200,30));
		
		
		
		
		
		jphy3.setBackground(Color.LIGHT_GRAY);
		jphy4 = new JPanel(new GridLayout(1,2));
		jphy4_1 = new JPanel(new GridLayout(1,1));
		jphy4_1.setBackground(Color.white);
		jphy4_2 = new JPanel(new FlowLayout(1,4,10));   //����һ���µ������Ⱦֹ�����������ָ�����ڶ����뷽ʽ�Լ�ָ����ˮƽ�ʹ�ֱ��϶��
		/*  FlowLayout�ĵ�һ������
		 	public static final int CENTER 1
			public static final int LEADING 3
			public static final int LEFT 0
			public static final int RIGHT 2
			public static final int TRAILING 4
		 */
		jphy4_2.setBackground(Color.white);
		jl1=new JLabel("ɽ����վ", new ImageIcon("src\\images\\ͼƬ6.jpg"),JLabel.CENTER);
//		jl1.setPreferredSize(new Dimension(0, 50));
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		jphy4_jb1 = new JButton("һ�ܱ���");
		jphy4_jb1.setBackground(Color.LIGHT_GRAY);
		jphy4_jb2 = new JButton("�༭����");
		jphy4_jb2.setBackground(Color.LIGHT_GRAY);
		jphy4_jb3 = new JButton("������Ʒ");
		jphy4_jb3.setBackground(Color.LIGHT_GRAY);
		jphy4_jb4= new JButton("�ҵ���Ʒ");
		jphy4_jb4.setBackground(Color.LIGHT_GRAY);
		
		jphy4_jb3.addActionListener(this);
		jphy4_jb2.addActionListener(this);	
		jbb.addActionListener(this);
		
//		jphy_jb2 = new JButton("��Ʒ", new ImageIcon("src\\images\\ͼƬ1.png"));
////		jphy_jb2.setContentAreaFilled(false);
////		jphy_jb2.setBorderPainted(false);
////		jphy_jb2.setBackground(Color.black);
////		jphy_jb2.setForeground(Color.black);
//		jphy_jb3 = new JButton("����", new ImageIcon("src\\images\\ͼƬ2.png"));
////		jphy_jb3.setContentAreaFilled(false);
////		jphy_jb3.setBackground(Color.black);
////		jphy_jb3.setForeground(Color.black);
////		jphy_jb3.setBorderPainted(false);
//		jphy_jb4 = new JButton("���ﳵ", new ImageIcon("src\\images\\ͼƬ3.png"));
////		jphy_jb4.setContentAreaFilled(false);
////		jphy_jb4.setBackground(Color.black);
////		jphy_jb4.setForeground(Color.black);
////		jphy_jb4.setBorderPainted(false);
//		jphy_jb5 = new JButton("�ҵ�", new ImageIcon("src\\images\\ͼƬ4.png"));
////		jphy_jb5.setContentAreaFilled(false);
////		jphy_jb5.setBorderPainted(false);
////		jphy_jb5.setBackground(Color.black);
////		jphy_jb5.setForeground(Color.white);
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
//		jphy_jb4.setBackground(Color.LIGHT_GRAY);
//		jphy_jb4.setForeground(Color.black);
//		jphy_jb4.setBorderPainted(false);
		jphy_jb5 = new JButton("�ҵ�", new ImageIcon("src\\images\\ͼƬ4.png"));
//		jphy_jb5.setContentAreaFilled(false);
//		jphy_jb5.setBorderPainted(false);
//		jphy_jb5.setBackground(Color.LIGHT_GRAY);
		jphy_jb5.setBackground(Color.darkGray);
		
		
		jphy_jb2.addActionListener(this);
		jphy_jb3.addActionListener(this);
		jphy_jb4.addActionListener(this);
		
		psex=new JLabel("Ů");
		jphy2_1.add(jl2);
		jphy2_1.add(blank2);
		jphy2_2.add(blank1);
		jphy2_2.add(userId);
		jphy2_2.add(sex);
		jphy2_2.add(name);
		jphy2_2.add(major);
		jphy2_2.add(grade);
		
//		userId =new JLabel("ѧ��"+u0.getUserId());
//		sex =new JLabel("�Ա�"+u0.getSex());
//		name =new JLabel("����"+u0.getName());
//		major =new JLabel("רҵ"+u0.getMajor());
//		grade =new JLabel("�꼶"+u0.getGrade());
		
		jphy2.add(jphy2_1);
		jphy2.add(jphy2_2);
		
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		jphy3.add(jphy_jb4);
		jphy3.add(jphy_jb5);
		jphy3.setPreferredSize(new Dimension(0, 50));
		
		jphy4_1.add(jl1);
		
		jphy4_2.add(jphy4_jb1);
		jphy4_2.add(jphy4_jb2);
		jphy4_2.add(jphy4_jb3);
		jphy4_2.add(jphy4_jb4);
		jphy4.add(jphy4_1);
		jphy4.add(jphy4_2);
		
		jphy1.add(jphy2,"Center");
		jphy1.add(jphy4,"North");
		jphy1.add(jphy3,"South");
		
		this.setTitle(u0.getName());
		this.setDefaultCloseOperation(3);
		this.add(jphy1,"Center");
		this.setSize(800,800);
		this.setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
		this.setUndecorated(false); 
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		User u=new User();
		u.setGrade("��һ");
		u.setUserId("201900301075");
		u.setMajor("�������");
		u.setName("ţ��Ⱥ");
		u.setSex("��");
		new Mine2(u);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==jphy_jb4) {   //���ﳵ��ť
			
			new ShoppingTrolley2(u0);
			this.dispose();
//			this.setVisible(true);
		}
		
		if (e.getSource()==jphy_jb2) {     //��Ʒ�б�ť
			new Shoplist2(u0);
			this.dispose();

		}
		
		if (e.getSource()==jphy4_jb3) {     //������Ʒ
			new ReleaseCommodity(u0);
		}
		
		if (e.getSource()==jphy4_jb2) {    //�༭����
			JLabel tuserId =new JLabel("�û���");
//			tuserId.setPreferredSize(new Dimension(400, 50));
			tuserId.setFont(new Font("����", Font.BOLD, 30));
			JLabel tsex =new JLabel("�Ա�");
//			tsex.setPreferredSize(new Dimension(400, 50));
			tsex.setFont(new Font("����", Font.BOLD, 30));
			JLabel tname =new JLabel("���֣�");
//			tname.setPreferredSize(new Dimension(400, 50));
			tname.setFont(new Font("����", Font.BOLD, 30));
			JLabel tmajor =new JLabel("רҵ��");
//			tmajor.setPreferredSize(new Dimension(400, 50));
			tmajor.setFont(new Font("����", Font.BOLD, 30));
			JLabel tgrade =new JLabel("�꼶��");
//			tgrade.setPreferredSize(new Dimension(400, 50));
			tgrade.setFont(new Font("����", Font.BOLD, 30));
			
			
			jbb.setPreferredSize(new Dimension(150,40));
			JPanel j1=new JPanel(new FlowLayout(0,4,4));
			JPanel j2=new JPanel(new FlowLayout(0,4,4));
			JPanel j3=new JPanel(new FlowLayout(0,4,4));
			JPanel j4=new JPanel(new FlowLayout(0,4,4));
			JPanel j5=new JPanel(new FlowLayout(0,4,4));
			JPanel j6=new JPanel(new FlowLayout(1,4,4));
			j1.add(tuserId);
			j1.add(userIdfi);
			j2.add(tsex);
			j2.add(sexfi);
			j3.add(tname);
			j3.add(namefi);
			j4.add(tmajor);
			j4.add(majorfi);
			j5.add(tgrade);
			j5.add(gradefi);
			j6.add(jbb);
			
			jphy2_2.removeAll();
			jphy2_2.repaint();
			jphy2_2.add(blank1);
			jphy2_2.add(j1);
			jphy2_2.add(j2);
			jphy2_2.add(j3);
			jphy2_2.add(j4);
			jphy2_2.add(j5);
			jphy2_2.add(j6);
			jphy2_2.revalidate();
		}
		if (e.getSource()==jbb) {   //ȷ���޸İ�ť
			JOptionPane.showMessageDialog(this, "�޸ĳɹ�");
			jphy2_2.removeAll();
			jphy2_2.repaint();
			jphy2_2.add(blank1);
			jphy2_2.add(userId);
			jphy2_2.add(psex);
			jphy2_2.add(name);
			jphy2_2.add(major);
			jphy2_2.add(grade);
			jphy2_2.revalidate();
		}
		
	}
}
