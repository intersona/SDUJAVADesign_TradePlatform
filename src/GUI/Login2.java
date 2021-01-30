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
	//����һ������
	Container ct;
	//����������塣
	BackgroundPanel bgp;

	public Login2() {
		
		
		super("�����г�");
		setSize(800,800);
		setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * ��ӭ����
		 */
		label1=new JLabel("��ӭ����ɽ����ֽ����г�");
		label1.setBounds(120, 20, 200, 20);
		add(label1);
		
		
//		ct=this.getContentPane();
//		
//		
//		bgp=new BackgroundPanel((new ImageIcon("src\\images\\hardware1.jpg")).getImage());
//		bgp.setBounds(0,0,400,500);
//		ct.add(bgp);
		
		
		
		
		
		
		
		
		
		/*
		 * ��һ�����
		 */
		add(panel1);
		
		panel1.setLayout(null);
		
		//�û�����ǩ
		namelabel=new JLabel("ѧ�ţ�");
		namelabel.setBounds(20,70,80,25);
		panel1.add(namelabel);
		
		//�û����ı���
		JTextField textfield=new JTextField();
		textfield.setBounds(80, 70, 100, 20);
		panel1.add(textfield);
		
		//�����ǩ
		passwdlabel=new JLabel("���룺");
		passwdlabel.setBounds(20,100,80,25);
		panel1.add(passwdlabel);
		
		//�����
		passwdfield=new JPasswordField();
		passwdfield.setBounds(80, 100, 100, 20);
		panel1.add(passwdfield);
		
		//��¼��ť
		loginbutton=new JButton("��¼");
		loginbutton.setBorderPainted(false);
		loginbutton.setBounds(80, 130, 60, 20);
		panel1.add(loginbutton);
		loginbutton.addActionListener(this);
		loginbutton.setContentAreaFilled(false);
		loginbutton.setBorderPainted(true);
		
		//ע�ᰴť
		registerButton=new JButton("ע��");
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
		if (e.getSource()==loginbutton) {    //ȷ����ť	
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(textfield.getText().trim());
				u.setPassword(new String(passwdfield.getPassword()));
				u.setAction(1);
//				if (t.checkUser(u)) {   // login successfully
//					JOptionPane.showMessageDialog(this, "��½�ɹ�");
//				}else {       //fail
//					JOptionPane.showMessageDialog(this, "�û��������������");
//				}
			
		}
		
		if (e.getSource()==registerButton) {
			new Register();
			this.dispose();
			
		}
		
	}
	
}
