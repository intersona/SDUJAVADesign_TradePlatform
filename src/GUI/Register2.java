package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Client.TestLogin;
import base.DIYClass.User;


public class Register2 extends JFrame implements ActionListener{
	JPanel jp1,jp2,jp3,jp4,jp5;
	JLabel jl1,jl2,jl3,jl4,jl5;
	JButton jb1,jb2,jb3;
	JTextField jtf;
	JPasswordField jpf1,jpf2;
	
	public Register2() {
		jp1=new JPanel();   //����
		jp2=new JPanel();   //�Ϸ�����
		jp3=new JPanel();   //��¼��
		jp1.setBackground(Color.white);
		jp1.setBounds(0,0,800,800);
		
		jp2.setBackground(Color.darkGray);
		jp2.setBounds(0, 0, 800, 100);
		
		jp3.setBackground(Color.darkGray);
		jp3.setBounds(200, 200, 400,400 );
//		
		
		

		
		
		jl1=new JLabel("�˺�");
		jl1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		jl1.setForeground(Color.white);
		jl2=new JLabel("����");
		jl2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		jl2.setForeground(Color.white);
		jl3=new JLabel("ɽ��������Ʒ����",JLabel.CENTER);
		jl3.setFont(new Font("����", Font.BOLD, 50));
		jl3.setForeground(Color.white);
		jl4=new JLabel("�û�ע��");
		jl4.setFont(new Font("΢���ź�", Font.BOLD, 20));
		jl4.setForeground(Color.white);
		jl5=new JLabel("ȷ������");
		jl5.setFont(new Font("΢���ź�", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		
		jtf=new JTextField();
		jpf1=new JPasswordField();
		jpf2=new JPasswordField();
		
		jb1=new JButton("ȷ��");
//		jb2=new JButton("ע��");
//		jb3=new JButton("ȡ��");
		
		
		jtf.setBorder(null);
		jtf.setBackground(Color.LIGHT_GRAY);
		jpf1.setBorder(null);
		jpf1.setBackground(Color.LIGHT_GRAY);
		jpf2.setBorder(null);
		jpf2.setBackground(Color.LIGHT_GRAY);
		jb1.setBorderPainted(false);
		jb1.setBackground(Color.BLACK);
		jb1.setForeground(Color.white);
//		jb2.setBorderPainted(false);
////		jb2.setContentAreaFilled(false);
//		jb2.setBackground(Color.BLACK);
//		jb2.setForeground(Color.white);
//		jb3.setBorderPainted(false);
//		jb3.setBackground(Color.BLACK);
////		jb3.setContentAreaFilled(false);
//		jb3.setForeground(Color.white);
		
		jl4.setBounds(350, 250, 100, 50);
		
		jl1.setBounds(250, 250+50+10, 40, 25);
		jl2.setBounds(250, 300+50+10, 40, 25);
		jl5.setBounds(210, 350+50+10, 80, 25);
		jtf.setBounds(300, 250+50+10, 200, 25);
		jpf1.setBounds(300, 300+50+10, 200, 25);
		jpf2.setBounds(300, 350+50+10, 200, 25);
		
		
		jb1.setBounds(320, 395+50+10, 150, 25);
//		jb2.setBounds(320, 400+50+10, 70, 25);
//		jb3.setBounds(400, 400+50+10, 70, 25);
		
		
		
		jb1.addActionListener(this);
		
		
		jp2.add(jl3);
		
		
		
		
		
		this.setLayout(null);
		this.add(jl4);
		this.add(jl1);
		this.add(jl2);
		this.add(jl5);
		this.add(jtf);
		this.add(jpf1);
		this.add(jpf2);
		this.add(jb1);
//		this.add(jb2);
//		this.add(jb3);
		
		this.add(jp2);
		this.add(jp3);    //������������˳��ǳ���Ҫ����Ȼ���ܲ���������ʾ����ĿǰΪֹ��Ҳ��֪����Ϊʲô
		this.add(jp1);
		
		
		
		
		
		
		this.setSize(800,800);
		this.setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Register2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jb1) {
			
			if (!(new String(jpf1.getPassword()).equals(new String(jpf2.getPassword())))){
				JOptionPane.showMessageDialog(this, "�������벻һ��");
			}else {
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(jtf.getText().trim());
				u.setPassword(new String(jpf1.getPassword()));
				u.setAction(0);
				if (t.registerUser(u)) {   //�ɹ�ע��
					JOptionPane.showMessageDialog(this, "ע��ɹ�,�����µ�¼");
					this.dispose();
					new Login3();
				}else {
					JOptionPane.showMessageDialog(this, "������Щ���⣬��������һ��");
				}
			}
		}
	}
}
