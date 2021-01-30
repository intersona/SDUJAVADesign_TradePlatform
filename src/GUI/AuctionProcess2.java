package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import Client.Connect;
import base.DIYClass.Comment;
import base.DIYClass.Item;
import base.DIYClass.Message;
import base.DIYClass.User;

public class AuctionProcess2 extends JFrame implements ActionListener{
	
	JPanel jp1;
	JButton jb1,jb2,jb3,jb4,jb5;
	JLabel jl1,jl2,jl3,jl11,jl22,jl33,jl4,jl44;
	JLabel currentPrice,currentPeople;
	JTextField jtf,currentPricetext,currentPeopletext;
	User u0;
	Item i0;
	TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
	public AuctionProcess2(User u,Item i) {
		u0=u;
		i0=i;
		
		Image image=new ImageIcon("src\\images\\图片7.gif").getImage();  
		jp1= new BackgroundPanel(image);
		jp1.setBorder(border);
		jp1.setBounds(30, 40, 300, 400);
		
//		jp2= new JPanel();
//		jp2.setBackground(Color.darkGray);
//		jp2.setBounds(350,220,250,100);
		
		jl1= new JLabel("名称:");
		jl1.setBounds(350, 40, 60, 40);
		jl1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl2= new JLabel("起拍:");
		jl2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl2.setBounds(350, 90, 60, 40);
		jl3= new JLabel("描述:");
		jl3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl3.setBounds(350, 140, 60, 40);
//		jl4= new JLabel("卖家:");
		
		jl11= new JLabel("IPad Air3");
		jl11.setBounds(400, 40, 100, 40);
		jl11.setFont(new Font("微软雅黑", Font.BOLD, 15));
		jl22= new JLabel("250 dollars");
		jl22.setBounds(400, 90, 100, 40);
		jl22.setFont(new Font("微软雅黑", Font.BOLD, 15));
		jl33= new JLabel("<html>2019年底买的，99新，绝对好用</html>");
//		jl33.setText("<html>abc <br>def </html>");
		jl33.setBounds(350,150,250,100);
		jl33.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		
		
		jb3= new JButton("立即竞价");
//		jb3.setContentAreaFilled(false);
		jb3.setBounds(530, 410, 90, 20);
		jb3.setBackground(Color.lightGray);
//		jb3.setBorderPainted(false);
		jb3.setBorder(BorderFactory.createRaisedBevelBorder());
		jb3.setBorder(border);
		currentPeople = new JLabel("竞拍人数:");
		currentPeople.setFont(new Font("微软雅黑", Font.BOLD, 15));
		currentPeople.setBounds(400, 300, 90, 20);
		currentPeopletext=new JTextField("6");
//		currentPricetext.setBorder(border);
		currentPeopletext.setBounds(500,300,60,20);
		currentPeopletext.setEditable(false);
		currentPrice =new JLabel("当前竞拍价:");
		currentPrice.setFont(new Font("微软雅黑", Font.BOLD, 15));
		currentPrice.setBounds(400, 350, 90, 20);
		currentPricetext =new JTextField("60000");
//		currentPricetext.setBorder(border);
		currentPricetext.setBounds(500,350,60,20);
		currentPricetext.setEditable(false);
		jtf = new JTextField();
		jtf.setBounds(350, 410, 160, 20);
		
		jtf.setBorder(border);
		
		jb3.addActionListener(this);
		
		
		this.setTitle("商品详细信息");
//		this.add(jb1);
//		this.add(jb2);
		this.add(jb3);
//		this.add(jb4);
//		this.add(jb5);
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl11,JLabel.CENTER);
		this.add(jl22,JLabel.CENTER);
		this.add(jl33,JLabel.CENTER);
		this.add(jtf);
		this.add(currentPrice);
		this.add(currentPricetext);
		this.add(currentPeople);
		this.add(currentPeopletext);
		
		this.add(jp1);
		this.setLayout(null);
		this.setSize(700,500);
		this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
		this.setUndecorated(false); 
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		new AuctionProcess2(new User(),new Item());
		System.out.println(new Date());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()==jb3) {
			currentPricetext.setText("666666");
			
		}
		
	}
	
	public void finishWindow(boolean flag) {
		if (flag) {
			JOptionPane.showMessageDialog(this,"拍卖结束，恭喜，您购得该商品");
		}else {
			JOptionPane.showMessageDialog(this,"拍卖结束，抱歉，您未购得该商品");
		}
		
	}
	
}

