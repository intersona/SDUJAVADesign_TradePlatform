package GUI;

import java.awt.*;

import javax.swing.*;

public class Test extends JFrame{
	
	JPanel jp0;
	JTextField jtf;
		Test(){
			
			jtf =new JTextField();
			TextBorderUtlis border = new TextBorderUtlis(Color.black,2,true);
			jtf.setBorder(border);
			jtf.setBounds(100, 80, 200, 20);
			
			this.add(jtf);
			this.setLayout(null);
			this.setSize(700,500);
			this.setLocationRelativeTo(null); // �Ѵ���λ�����õ���Ļ����
			this.setUndecorated(false); 
			this.setVisible(true);
		}
			
		

		public static void main(String[] args){
			new Window();
		}
		
}
class Window extends JFrame
{
    JPanel myPanel1 = new JPanel();//���1
    JPanel myPanel2 =new JPanel();//���2
    JButton button1 = new JButton("��ʼ");//��ť1
    JButton button2 = new JButton("��ʼ");//��ť2
    JButton button3 = new JButton("��ʼ");//��ť3
    JSplitPane jSplitPane =new JSplitPane();//�趨Ϊ���Ҳ�ֲ���
    public Window()
    {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init()
    {
        jSplitPane.setOneTouchExpandable(true);//�÷ָ�����ʾ����ͷ
        jSplitPane.setContinuousLayout(true);//������ͷ���ػ�ͼ��
        //jSplitPane.setPreferredSize(new Dimension (100,200));
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);//���÷ָ��߷���
        myPanel1.setSize(400, 400);
        myPanel2.setSize(200, 400);
        jSplitPane.setLeftComponent(myPanel1);//������������ �����1
        jSplitPane.setRightComponent(myPanel2);//������2
        jSplitPane.setDividerSize(1);//���÷ָ��ߵĿ��
        //jSplitPane.setDividerLocation(100);//���÷ָ���λ������
        jSplitPane.setDividerLocation(400);//�趨�ָ��ߵľ�����ߵ�λ��
        setContentPane(jSplitPane);
        //pack();
        myPanel1.add(button1);
        myPanel2.add(button3);
        myPanel2.add(button2);
        //add(myPanel1);
        myPanel1.setBorder(BorderFactory.createLineBorder(Color.green));
        //add(myPanel2);
        myPanel2.setBorder(BorderFactory.createLineBorder(Color.red));
    }

}
