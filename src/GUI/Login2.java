package GUI;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Client.*;
import base.DIYClass.*;

public class Login2 extends JFrame implements ActionListener{
	
//	JPanel jp1;
	
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	
	JLabel label1;
	JLabel namelabel;
	JTextField textfield;
	JLabel passwdlabel;
	JPasswordField passwdfield;
	JButton loginbutton;
	JButton registerButton;
	//创建一个容器
	Container ct;
	//创建背景面板。
	BackgroundPanel bgp;

	public Login2() {
		
		
		super("交易市场");
		setSize(800,800);
		setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * 欢迎话语
		 */
		label1=new JLabel("欢迎进入山大二手交易市场");
		label1.setBounds(120, 20, 200, 20);
		add(label1);
		
		
//		ct=this.getContentPane();
//		
//		
//		bgp=new BackgroundPanel((new ImageIcon("src\\images\\hardware1.jpg")).getImage());
//		bgp.setBounds(0,0,400,500);
//		ct.add(bgp);
		
		
		
		
		
		
		
		
		
		/*
		 * 第一个面板
		 */
		add(panel1);
		
		panel1.setLayout(null);
		
		//用户名标签
		namelabel=new JLabel("学号：");
		namelabel.setBounds(20,70,80,25);
		panel1.add(namelabel);
		
		//用户名文本框
		JTextField textfield=new JTextField();
		textfield.setBounds(80, 70, 100, 20);
		panel1.add(textfield);
		
		//密码标签
		passwdlabel=new JLabel("密码：");
		passwdlabel.setBounds(20,100,80,25);
		panel1.add(passwdlabel);
		
		//密码框
		passwdfield=new JPasswordField();
		passwdfield.setBounds(80, 100, 100, 20);
		panel1.add(passwdfield);
		
		//登录按钮
		loginbutton=new JButton("登录");
		loginbutton.setBorderPainted(false);
		loginbutton.setBounds(80, 130, 60, 20);
		panel1.add(loginbutton);
		loginbutton.addActionListener(this);
		loginbutton.setContentAreaFilled(false);
		loginbutton.setBorderPainted(true);
		
		//注册按钮
		registerButton=new JButton("注册");
		registerButton.setBounds(80, 160, 60, 20);
		panel1.add(registerButton);
		registerButton.addActionListener(this);
		registerButton.setContentAreaFilled(false);
//		registerButton.setBorderPainted(false);

		
	}

	
	public static void main(String[] args) {
		new Login2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loginbutton) {    //确定按钮	
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(textfield.getText().trim());
				u.setPassword(new String(passwdfield.getPassword()));
				u.setAction(1);
//				if (t.checkUser(u)) {   // login successfully
//					JOptionPane.showMessageDialog(this, "登陆成功");
//				}else {       //fail
//					JOptionPane.showMessageDialog(this, "用户名或者密码错误");
//				}
			
		}
		
		if (e.getSource()==registerButton) {
			new Register();
			this.dispose();
			
		}
		
	}
	
}
