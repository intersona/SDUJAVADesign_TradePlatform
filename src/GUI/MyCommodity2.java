package GUI;

import javax.swing.*;

import Client.Connect;
import base.DIYClass.Item;
import base.DIYClass.Message;
import base.DIYClass.User;

public class MyCommodity2 extends JFrame{
	
	JTabbedPane jtp;
	JTable jtb1,jtb2;
	JPanel jp1,jp2;
	JScrollPane jsp;
	//1我买的    2我卖的
	User u0;
	Item [] i1,i2;
	
	public MyCommodity2(User u) {
		
//		this.u0=u;
//		Message m1=new Message();
//		m1.setFileCon(3);
//		m1.setContext(u0.getUserId());
//		Message m2=new Message();
//		m1.setFileCon(2);
//		m1.setContext(u0.getUserId());
//		
//		Connect con=new Connect();
//		
//		i1=con.getBoughtCommodity(m1);
//		i2=con.getSoldCommodity(m2);
		
		Object[] columnTitle1 = {"序号" , "商品名称" ,"卖家", "价格"};
		Object[][] tableData1=new Object[20][4];
		for (int i = 0; i < tableData1.length; i++) {
			tableData1[i][0]=i+1;
			tableData1[i][1]="name";
			tableData1[i][2]="name";
			tableData1[i][3]="name";
			
		}
		
//		if (i1[i].getAction()==0) {
//			tableData1[i][3]="正常售卖";
//		}else {
//			tableData1[i][3]="拍卖";
//		}
		
		
		jtb1=new JTable(tableData1,columnTitle1);
		
		
		Object[] columnTitle2 = {"序号" , "商品名称" ,"售卖方式", "价格"};
		Object[][] tableData2=new Object[4][4];
		for (int i = 0; i < tableData2.length; i++) {
			tableData2[i][0]=i+1;
			tableData2[i][1]="zui ";
//			if (i2[i].getAction()==0) {
//				tableData2[i][2]="正常售卖";
//			}else {
//				tableData2[i][2]="拍卖";
			
//			}
			tableData2[i][2]="拍卖";
			tableData2[i][3]=100;
			
		}
		jtb2=new JTable(tableData2,columnTitle2);
		
		jtb1.setRowHeight(30);
		jtb2.setRowHeight(30);
		
		jsp=new JScrollPane(jtb1);
		
//		jtp = new JTabbedPane();
//		jtp.add("我买到的",new JScrollPane(jtb1));
//		jtp.add("我发布的",new JScrollPane(jtb2));
		
		this.setTitle("我的商品");
		this.setDefaultCloseOperation(3);
		this.add(jsp,"Center");
		this.setSize(500,400);
		this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
		this.setUndecorated(false); 
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyCommodity2(new User());
	}
}
