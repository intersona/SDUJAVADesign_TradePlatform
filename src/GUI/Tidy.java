package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
 
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Tidy extends JFrame
{
    private static final long serialVersionUID = 1L;
 
    private static final String[] NS =
            { "秒表倒计时器", "时", "分", "秒", "请输入你倒计时的时间(分钟数):", "你一共用:", "时", "分", "秒", "开始倒计时", "暂停计时", "停止计时" };
 
    private static int index = 0;
 
    private long ms = 0;
 
    private boolean isPaused = false;
 
    private Timer timer;
 
    public Tidy(String title)
    {
        setTitle(title);
    }
 
    private Tidy addComponents()
    {
        final JTextField[] ts = new JTextField[7];
        for(int i = 0; i < 7; i++)
        {
            ts[i] = new JTextField();
            ts[i].setPreferredSize(new Dimension(50, 20));
            if(i != 3)
            {
                ts[i].setEditable(false);
            }
        }      //设置了7个文本框
        
        JLabel[] ls = new JLabel[9];
        for(int i = 0; i < 9; i++)
        {
            ls[i] = new JLabel(NS[index++]);
        }       //设置了那几个JLabel
        
        final JButton[] bs = new JButton[3];
        for(int i = 0; i < 3; i++)
        {
            bs[i] = new JButton(NS[index++]);
        }
        
        bs[0].addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if(!isPaused)
                    {
                        long min = Long.parseLong(ts[3].getText());
                        long h = min / 60;
                        h = h < 0 ? 0 : h;
                        long m = min - h * 60 - 1;
                        m = m < 0 ? 0 : m;
                        long s = min == 0 ? 0 : 60;
                        ts[0].setText(h + "");
                        ts[1].setText(m + "");
                        ts[2].setText(s + "");
                    }
                    timer = new Timer();
                    timer.schedule(new TimerTask()
                    {
                        @Override
                        public void run()
                        {
                            long h = Long.parseLong(ts[0].getText());
                            long m = Long.parseLong(ts[1].getText());
                            long s = Long.parseLong(ts[2].getText());
                            s--;
                            ms++;
                            if((h != 0 || m != 0) && s == 0)
                            {
                                m--;
                                s = 59;
                            }
                            if(h != 0 && m == 0)
                            {
                                h--;
                                m = 59;
                            }
                            h = h < 0 ? 0 : h;
                            m = m < 0 ? 0 : m;
                            s = s < 0 ? 0 : s;
                             
                            ts[0].setText(h + "");
                            ts[1].setText(m + "");
                            ts[2].setText(s + "");
 
                            long ph = ms / 60 / 60;
                            long pm = ms / 60;
                            long ps = ms % 60;
                            ts[4].setText(ph + "");
                            ts[5].setText(pm + "");
                            ts[6].setText(ps + "");
                             
                            if(h == 0 && m == 0 && s == 0)
                            {
                                bs[2].doClick();
                            }
                        }
                    }, 0, 1000);
                    bs[0].setEnabled(false);
                }
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showConfirmDialog(Tidy.this, "输入错误，请重新输入分钟的整数。", "友情提示", JOptionPane.PLAIN_MESSAGE,
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        bs[1].addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(null != timer)
                {
                    timer.cancel();
                    timer = null;
                }
                bs[0].setEnabled(true);
                isPaused = true;
            }
        });
        bs[2].addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(null != timer)
                {
                    timer.cancel();
                    timer = null;
                }
                bs[0].setEnabled(true);
                isPaused = false;
                ms = 0;
            }
        });
        JComponent[][] cs = { { ls[0] }, { ts[0], ls[1], ts[1], ls[2], ts[2], ls[3] }, { ls[4], ts[3] },
                { ls[5], ts[4], ls[6], ts[5], ls[7], ts[6], ls[8] }, { bs[0], bs[1], bs[2] } };
        JPanel[] ps = new JPanel[5];
        JPanel wrap = new JPanel();
        wrap.setLayout(new BoxLayout(wrap, BoxLayout.Y_AXIS));
        for(int i = 0; i < 5; i++)
        {
            ps[i] = new JPanel(new FlowLayout(FlowLayout.CENTER));
            for(int j = 0; j < cs[i].length; j++)
            {
                ps[i].add(cs[i][j]);
            }
            wrap.add(ps[i]);
        }
        add(wrap);
        return this;
    }
 
    private Tidy init()
    {
        pack();
//        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        return this;
    }
 
    public static void main(String[] args)
    {
        Tidy tidy = new Tidy(NS[index]);
        tidy.addComponents().init();
    }
 
}
