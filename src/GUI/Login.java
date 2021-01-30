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
			try { // ʹ��Windows�Ľ�����
			   UIManager
			     .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
//		jbl1 = new JLabel(new ImageIcon("src/abc.PNG"));// ���Է�ͼƬ
		jbl1 = new JLabel("�����г�",JLabel.CENTER);
		
		
		
		// �в�

		jp2 = new JPanel(new GridLayout(2, 3));//���ú�һ��2X3�Ĳ���
		jp2_jbl1 = new JLabel("�û���", JLabel.CENTER);//��һ������Ϊ��ʾ�����֣��ڶ���Ϊ����
		jp2_jbl2 = new JLabel("����", JLabel.CENTER);
		jp2_jb2 = new JButton("��������");
		jp2_jb2.setBorderPainted(false);
		jp2_jb2.setForeground(Color.blue);//��������Ϊ��ɫ
		jp2_jb2.addActionListener(this);
//		jp2_jbl4 = new JLabel("�˺ű���", JLabel.CENTER);
		jp2_jb1 = new JButton("�������");
		jp2_jb1.addActionListener(this);
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
//		jp2_jcb1 = new JCheckBox("��ס����");
//		jp2_jcb2 = new JCheckBox("�����¼");
		jp3 = new JPanel(new GridLayout(2, 3));
		jp3_jbl1 = new JLabel("ѧ��", JLabel.CENTER);
		jp3_jbl2 = new JLabel("����", JLabel.CENTER);
		jp3_jb2 = new JButton("����");
		jp3_jb2.setForeground(Color.blue);
//		jp3_jbl4 = new JLabel("�˺ű���", JLabel.CENTER);
		jp3_jb1 = new JButton("�������");
		jp3_jb1.addActionListener(this);
		jp3_jtf = new JTextField();     //�˺ſ�
		jp3_jpf = new JPasswordField();  //�����
//		jp3_jcb1 = new JCheckBox("��ס����");
//		jp3_jcb2 = new JCheckBox("�����¼");

		// �ѿؼ�����˳����뵽jp2��

		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jb2);
//		jp2.add(jp2_jcb1);
//		jp2.add(jp2_jcb2);
//		jp2.add(jp2_jbl4);

//		// �ѿؼ�����˳����뵽jp3��
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

		// ����ѡ����ڣ�������JPanel�Ž�ȥ�����ҷֺ�����

		jtp = new JTabbedPane();
		jtp.add("��¼", jp2);
		jtp.add("ע��", jp3);
		
		// �����ϲ����

		// �ϲ�
		jp1 = new JPanel();
		jp1_jb1 = new JButton("ȷ��");
		jp1_jb1.addActionListener(this);
//		jp1_jb2 = new JButton("ע��");
		jp1_jb3 = new JButton("ȡ��");
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
		
		
		//ע�������
		
		
	}
	
		
	public static void main(String[] args) {
		Login win=new Login();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jp2_jb2) {     //�������밴ť
			JOptionPane.showMessageDialog(this, "����110");
		}
		if (e.getSource()==jp2_jb1) {            //��¼ҳ�����������¼���Ӧ
			jp2_jtf.setText("");
			jp2_jpf.setText("");
		}
		
//		if (e.getSource()==jp3_jb1) {         //ע��ҳ�����������¼���Ӧ
//			jp3_jb1.setText("");
//			jp3_jpf.setText("");
//		}
		   
//		if (e.getSource()==jp3_jb2) {   //������ť
////			JOptionPane.showMessageDialog(this, "�յ����ķ���");
//			System.out.println("something wrong!");
//		}
		
		if (e.getSource()==jp1_jb3) {   //ȡ����ť
			this.dispose();
		}
		
		if (e.getSource()==jp1_jb1) {    //ȷ����ť
//			if (jp3_jtf.getText()==null) {
//				JOptionPane.showMessageDialog(this, "�������û���������");
//				System.out.println("�������û���������");
//			}
			
			if (jtp.getSelectedComponent()==jp2) {
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(jp2_jtf.getText().trim());
				u.setPassword(new String(jp2_jpf.getPassword()));
				u.setAction(1);
//				if (t.checkUser(u)) {   // login successfully
//					JOptionPane.showMessageDialog(this, "��½�ɹ�");
//				}else {       //fail
//					JOptionPane.showMessageDialog(this, "�û��������������");
//				}
			}else if (jtp.getSelectedComponent()==jp3) {
				TestLogin t=new TestLogin();
				User u=new User();
				u.setUserId(jp2_jtf.getText().trim());
				u.setPassword(new String(jp2_jpf.getPassword()));
				u.setAction(0);
				if (t.registerUser(u)) {   //�ɹ�ע��
					JOptionPane.showMessageDialog(this, "ע��ɹ�");
				}else {
					JOptionPane.showMessageDialog(this, "������Щ����");
				}
				
			}
		}
		
		
		
		
		
	}

}
