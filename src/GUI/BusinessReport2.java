package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

import javax.swing.*;

import Client.Connect;
import base.DIYClass.Item;
import base.DIYClass.Message;
import base.DIYClass.User;

public class BusinessReport2 extends JFrame{
	
	JPanel jp1;
	JScrollPane jsp;
	JTable jtb1;
	User u0;
	Item []itemArr;
	JLabel jl;
	public BusinessReport2(User u) {
		
		this.u0=u;
//		Message m=new Message();
//		m.setFileCon(3);
//		m.setContext(u0.getUserId());
//		Connect con=new Connect();
//		
//		itemArr=con.getBoughtCommodity(m);
		double totalPrice=0;
		Object[][] tableData=new Object[5][5];
		for (int i = 0; i < 5; i++) {
			tableData[i][0]=i+1+1000;
			tableData[i][1]="ɶҲ����";
			tableData[i][2]="ɶҲ����";
			tableData[i][3]="ɶҲ����";
			tableData[i][4]="ɶҲ����";
			totalPrice+=100;
		}
		
		jl =new JLabel("�����ܶ�Ϊ"+Double.toString(totalPrice));
		jl.setFont(new Font("΢���ź�", Font.BOLD, 15));
		Object[] columnTitle = {"���" , "��Ʒ����" ,"����","���", "�ɽ���"};
		
		jtb1=new JTable(tableData,columnTitle);
		jtb1.setRowHeight(30);
		jsp=new JScrollPane(jtb1);
		
		jp1=new JPanel(new FlowLayout(1,4,4));
		jp1.add(jl);
		this.setTitle("��ҵ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setLayout(new BorderLayout());
		this.add(jsp,"Center");
		this.add(jp1,BorderLayout.SOUTH);
		this.setSize(500,400);
		this.setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
		this.setUndecorated(false); 
		this.setVisible(true);
	}
	public static void main(String[] args) throws IOException {
		new BusinessReport2(new User());
	}
}
