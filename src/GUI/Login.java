package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;
import base.DIYClass.*;
import Client.*;

public class Login extends JFrame implements ActionListener{
	JLabel jbl1;
	JTabbedPane jtp;
	JPanel jp1,jp2, jp3;
	JLabel jp2_jbl1, jp2_jbl2,  jp2_jbl4, jp3_jbl1, jp3_jbl2,jp3_jbl4;
	JButton jp1_jb1, jp1_jb2, jp1_jb3,jp2_jb1, jp3_jb1,jp2_jb2,jp3_jb2;
	JTextField jp2_jtf, jp3_jtf;
	JPasswordField jp2_jpf, jp3_jpf;
	JCheckBox jp2_jcb1, jp2_jcb2, jp3_jcb1, jp3_jcb2;
	
	public Login() {
			try { // 使用Windows的界面风格
			   UIManager
			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
//		jbl1 = new JLabel(new ImageIcon("src/abc.PNG"));// 可以放图片
		jbl1 = new JLabel("交易市场",JLabel.CENTER);
		
		
		
		// 中部

		jp2 = new JPanel(new GridLayout(2, 3));//设置好一个2X3的布局
		jp2_jbl1 = new JLabel("用户名", JLabel.CENTER);//第一个参数为显示的文字，第二个为居中
		jp2_jbl2 = new JLabel("密码", JLabel.CENTER);
		jp2_jb2 = new JButton("忘记密码");
		jp2_jb2.setBorderPainted(false);
		jp2_jb2.setForeground(Color.blue);//忘记密码为蓝色
		jp2_jb2.addActionListener(this);
//		jp2_jbl4 = new JLabel("账号保护", JLabel.CENTER);
		jp2_jb1 = new JButton("清除输入");
		jp2_jb1.addActionListener(this);
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
//		jp2_jcb1 = new JCheckBox("记住密码");
//		jp2_jcb2 = new JCheckBox("隐身登录");
		jp3 = new JPanel(new GridLayout(2, 3));
		jp3_jbl1 = new JLabel("学号", JLabel.CENTER);
		jp3_jbl2 = new JLabel("密码", JLabel.CENTER);
		jp3_jb2 = new JButton("帮助");
		jp3_jb2.setForeground(Color.blue);
//		jp3_jbl4 = new JLabel("账号保护", JLabel.CENTER);
		jp3_jb1 = new JButton("清除输入");
		jp3_jb1.addActionListener(this);
		jp3_jtf = new JTextField();     //账号框
		jp3_jpf = new JPasswordField();  //密码框
//		jp3_jcb1 = new JCheckBox("记住密码");
//		jp3_jcb2 = new JCheckBox("隐身登录");

		// 把控件按照顺序加入到jp2中

		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jb2);
//		jp2.add(jp2_jcb1);
//		jp2.add(jp2_jcb2);
//		jp2.add(jp2_jbl4);

//		// 把控件按照顺序加入到jp3中
//
		jp3.add(jp3_jbl1);
		jp3.add(jp3_jtf);
		jp3.add(jp3_jb1);
		jp3.add(jp3_jbl2);
		jp3.add(jp3_jpf);
		jp3.add(jp3_jb2);
//		jp3.add(jp3_jcb1);
//		jp3.add(jp3_jcb2);
//		jp3.add(jp3_jbl4);

		// 创建选项卡窗口，把两个JPanel放进去，并且分好名字

		jtp = new JTabbedPane();
		jtp.add("登录", jp2);
		jtp.add("注册", jp3);
		
		// 定义南部组件

		// 南部
		jp1 = new JPanel();
		jp1_jb1 = new JButton("确定");
		jp1_jb1.addActionListener(this);
//		jp1_jb2 = new JButton("注册");
		jp1_jb3 = new JButton("取消");
		jp1_jb3.addActionListener(this);
		jp1.add(jp1_jb1);
//		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		this.add(jp1, "South");
		this.add(jtp, "Center");
		this.add(jbl1, "North");
		
		this.setSize(350, 185);
		this.setLocation(600,365);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		//注册监听器
		
		
	}
	
		
	public static void main(String[] args) {
		Login win=new Login();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jp2_jb2) {     //忘记密码按钮
			JOptionPane.showMessageDialog(this, "拨打110");
		}
		if (e.getSource()==jp2_jb1) {            //登录页面清除输入的事件响应
			jp2_jtf.setText("");
			jp2_jpf.setText("");
		}
		
//		if (e.getSource()==jp3_jb1) {         //注册页面清除输入的事件响应
//			jp3_jb1.setText("");
//			jp3_jpf.setText("");
//		}
		   
//		if (e.getSource()==jp3_jb2) {   //帮助按钮
////			JOptionPane.showMessageDialog(this, "收到您的反馈");
//			System.out.println("something wrong!");
//		}
		
		if (e.getSource()==jp1_jb3) {   //取消按钮
			this.dispose();
		}
		
		if (e.getSource()==jp1_jb1) {    //确定按钮
//			if (jp3_jtf.getText()==null) {
//				JOptionPane.showMessageDialog(this, "请输入用户名和密码");
//				System.out.println("请输入用户名和密码");
//			}
			
			if (jtp.getSelectedComponent()==jp2) {
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(jp2_jtf.getText().trim());
				u.setPassword(new String(jp2_jpf.getPassword()));
				u.setAction(1);
//				if (t.checkUser(u)) {   // login successfully
//					JOptionPane.showMessageDialog(this, "登陆成功");
//				}else {       //fail
//					JOptionPane.showMessageDialog(this, "用户名或者密码错误");
//				}
			}else if (jtp.getSelectedComponent()==jp3) {
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(jp2_jtf.getText().trim());
				u.setPassword(new String(jp2_jpf.getPassword()));
				u.setAction(0);
				if (t.registerUser(u)) {   //成功注册
					JOptionPane.showMessageDialog(this, "注册成功");
				}else {
					JOptionPane.showMessageDialog(this, "出现了些问题");
				}
				
			}
		}
		
		
		
		
		
	}

}
